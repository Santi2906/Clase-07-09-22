/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Santiago
 */
public class Conexion_Sigleton {
    private static Conexion_Sigleton instance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/jdbc";
    private String username = "postgres";
    private String password = "123456";

    private Conexion_Sigleton() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Fallo la conexión a la base de datos : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static Conexion_Sigleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new Conexion_Sigleton();
        } else if (instance.getConnection().isClosed()) {
            instance = new Conexion_Sigleton();
        }

        return instance;
    }
}
