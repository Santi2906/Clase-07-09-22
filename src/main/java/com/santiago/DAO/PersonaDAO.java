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
 *PATRON DE DISEÑO SINGLETON
 * @author administradorPC
 */
public class PersonaDAO {

    private static final String SQL_READALL = "SELECT * FROM bd_persona ";
    Conexion con= new Conexion();

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
