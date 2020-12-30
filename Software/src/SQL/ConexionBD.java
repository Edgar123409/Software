/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author edgar
 */
public class ConexionBD {
    
    public static String url = "jdbc://localhost/nombredelabase"; 
    public static String usuario = "root";
    public static String contraseña = "root"; 
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static  Connection conectar(){
    
    Connection conexion = null;
    
try {
    Class.forName(clase);
    conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
    System.out.println("Conexión establecida");
} catch(ClassNotFoundException | SQLException e){
    
    System.out.println(e);
    }
return conexion;
    }
}