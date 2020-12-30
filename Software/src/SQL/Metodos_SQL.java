/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author edgar
 */
public class Metodos_SQL {

    public static ConexionBD conexion = new ConexionBD();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero;

    public int guargar(String nombre, String apellidos, String correo, String contraseña) {

        int resultado = 0;
        Connection conexion = null;
        
        String sentencia_guardar = ("INSERT INTO tabla()");

    }
}
