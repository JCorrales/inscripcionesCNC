/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

/**
 *
 * @author Acer Aspire
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import modelos.Alumno;
import session.SessionManager;

public class AlumnoDao {
    Connection conexion;

    public AlumnoDao() {
        conexion = SessionManager.getConexion();
    }
    
    public boolean insert(Alumno a) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        return stm.execute("insert into alumnos(cedula, nombre, apellido, direccion, telefono, anio) "
                + "values("+a.getCedula()+",'"+a.getNombre()+"','"+a.getApellido()+"','"
                +a.getDireccion()+"','"+a.getTelefono()+"',"+a.getAnio()+");");
    }
    
    public boolean delete(int cedula) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        return stm.execute("delete from alumnos where cedula ="+cedula+";");
    }
    
    public Alumno consultarPorCedula(int cedula) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from alumnos where cedula = "+cedula+";");
        r.next();
        try{
            r.getInt("cedula");
        }
        catch(Exception ex){
            return null;
        }
        return new Alumno(r.getInt("cedula"), r.getString("nombre"),r.getString("apellido"), 
                r.getString("direccion"),r.getString("telefono"),r.getInt("anio"));
    }
    
    public LinkedList consultarAlumnos() throws SQLException{
        Statement stm;
        LinkedList<Alumno> alumnos = new LinkedList();
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from alumnos");
        r.next();
        r.getInt("cedula");
        if(r.wasNull())
            throw new SQLException();
        r.previous();
        while(r.next()){
            alumnos.add(new Alumno(r.getInt("cedula"), r.getString("nombre"),r.getString("apellido"), 
                    r.getString("direccion"),r.getString("telefono"),r.getInt("anio")));
        }
        return alumnos;
    }
    
    public LinkedList consultarAlumnosPorAnio(int anio) throws SQLException{
        Statement stm;
        LinkedList<Alumno> alumnos = new LinkedList();
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from alumnos where anio = "+anio);
        r.next();
        r.next();
        r.getInt("cedula");
        if(r.wasNull())
            throw new SQLException();
        r.previous();
        while(r.next()){
            alumnos.add(new Alumno(r.getInt("cedula"), r.getString("nombre"),r.getString("apellido"), 
                    r.getString("direccion"),r.getString("telefono"),r.getInt("anio")));
        }
        return alumnos;
    }
}

