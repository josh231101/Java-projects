/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/datosPaises?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "jdaa23";
    
    public Connection getConnection(){
        Connection conexion=null;
        
        try{
            //Conexion a lab base de dato
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
            
            
        }catch(Exception ex){
            System.err.println("Error al hacer conexion con la base de datos: "+ ex);
        }
        return conexion;
    }
    
}
