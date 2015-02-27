package session;

import daos.AlumnoDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer Aspire
 */
public class SessionManager {
    static Connection conexion;

    static public Connection getConexion() {
        try {
            Class.forName ("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        try {
            String cadena = "jdbc:postgresql://localhost:5432/e_inscripciones";
            conexion = DriverManager.getConnection(cadena, "postgres","12345");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }     
        return conexion;
    }
   
    public static void main(String[] args) {
        AlumnoDao a = new AlumnoDao();
        try {
            System.out.println(a.consultarPorCedula(12345));
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
