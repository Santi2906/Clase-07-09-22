/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiago.DAO;

import com.santiago.Conexion.Conexion;
import com.santiago.Conexion.Conexion_Sigleton;
import com.santiago.DTO.PersonaDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * PATRON DE DISEÑO SINGLETON
 *
 * @author administradorPC
 */
public class PersonaDAO {

    private static final String SQL_READALL = "SELECT * FROM bd_persona ";
    Conexion con = new Conexion();

    public PersonaDAO() {
        con.conectar();
    }

    public List<PersonaDTO> readAll() {

        List<PersonaDTO> lista = null;
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                PersonaDTO obj = new PersonaDTO(rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("password"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
        return lista;
    }

    public void registrar(PersonaDTO obj) {
        String nombre = obj.getNombre();
        String apellido = obj.getApellido();
        String telefono = obj.getTelefono();
        String correo = obj.getCorreo();
        String pass = obj.getPassword();
        String SQL_INSERT = "INSERT INTO bd_persona (nombre,apellido,telefono,correo,password) VALUES(?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, telefono);
            ps.setString(4, correo);
            ps.setString(5, pass);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("No se pudo agregar nuevo empleado por: " + ex);
        }
    }

    public PersonaDTO validacion(String correo, String pass) {
        String SQL_VALIDAR = "SELECT * FROM bd_persona WHERE correo=? AND password=?";
        PreparedStatement ps;
        ResultSet rs;
        PersonaDTO obj = new PersonaDTO();
        try {
            ps = con.getConexion().prepareStatement(SQL_VALIDAR);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                obj.setID(rs.getInt("id"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setTelefono(rs.getString("telefono"));
                obj.setCorreo(rs.getString("correo"));
            }
        } catch (Exception ex) {
            System.out.println("No se hizo la validación por: " + ex);
        }
        return obj;
    }

    public List<PersonaDTO> readAll1() throws SQLException {
        Conexion_Sigleton con;
        con = Conexion_Sigleton.getInstance();
        con.getConnection();
        List<PersonaDTO> lista = null;
        PreparedStatement ps;
        try {
            ps = con.getConnection().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                PersonaDTO obj = new PersonaDTO(rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("password"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
        return lista;
    }
}
