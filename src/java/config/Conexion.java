/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author f-cri
 */
public class Conexion {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/tecdiget";
    String user = "fcristianoc";
    String pass = "Prueba1#";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            /*Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecdiget?serverTimezone=UTC&useSSL=false", "root", "1234");*/

            System.out.println("Conexion exitosa a la base de datos");

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return con;
    }

}
