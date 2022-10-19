/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiago.Conexion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author administradorPC
 */
public class Conexion {
    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;

    public Conexion(Connection conectar, String BD, String usuario, String contra) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contra = contra;
    }
    public Conexion() {
        this.conectar = null;
        this.BD = "";
        this.usuario = "root";
        this.contra = "";
    }
     public void conectar(){
         try{
             Class.forName("org.postgresql.Driver");
             this.BD="";
             this.usuario="root";
             this.contra="";
             this.conectar= (Connection) DriverManager.getConnection(BD,usuario,contra);
         } catch (ClassNotFoundException  | HeadlessException | SQLException e) {
             System.out.println("Error al conectar: " + e);
         }
     }
     
     public Connection getConexion(){
         return conectar;
     }
}
