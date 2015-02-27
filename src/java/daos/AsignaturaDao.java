/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import modelos.Asignatura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import session.SessionManager;

/**
 *
 * @author Acer Aspire
 */
public class AsignaturaDao {
    Connection conexion = SessionManager.getConexion();
    
    public boolean insert(Asignatura a) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        return stm.execute("insert into asignaturas values ("+a.getCodigo()+",'"+
                a.getDescripcion()+"',"+a.getAnio()+",'"+a.getTurno()+"','"+
                a.getSeccion()+"','"+a.getFecha_ini()+"','"+a.getFecha_fin()+"');");
    }
    
    public boolean delete(int codigo) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        return stm.execute("delete from asignaturas where codigo ="+codigo+";");
    }
    
    public Asignatura consultarPorCedula(int codigo) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from asignaturas where codigo = "+codigo+";");
        r.next();
        return new Asignatura(r.getInt("codigo"), r.getString("descripcion"),r.getInt("anio"), 
                r.getString("turno"),r.getString("seccion"),r.getString("fecha_ini"),r.getString("fecha_fin"));
    }
    
    public LinkedList consultarAsignaturas() throws SQLException{
        Statement stm;
        LinkedList<Asignatura> asignaturas = new LinkedList();
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from asignaturas");
        r.next();
        while(r.next()){
            asignaturas.add(new Asignatura(r.getInt("codigo"), r.getString("descripcion"),r.getInt("anio"), 
                r.getString("turno"),r.getString("seccion"),r.getString("fecha_ini"),r.getString("fecha_fin")));
        }
        return asignaturas;
    }
    
    public LinkedList consultarAsignaturasPorAnio(int anio) throws SQLException{
        Statement stm;
        LinkedList<Asignatura> asignaturas = new LinkedList();
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from asignaturas where anio = "+anio);
        r.next();
        while(r.next()){
            asignaturas.add(new Asignatura(r.getInt("codigo"), r.getString("descripcion"),r.getInt("anio"), 
                r.getString("turno"),r.getString("seccion"),r.getString("fecha_ini"),r.getString("fecha_fin")));
        }
        return asignaturas;
    }
}
