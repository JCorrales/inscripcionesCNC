/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import modelos.Asignatura;
import java.sql.Connection;
import java.sql.Date;
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
                a.getSeccion()+"','"+a.getFecha_ini().toString()+"','"+a.getFecha_fin().toString()+"');");
    }
    
    public boolean delete(int codigo) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        return stm.execute("delete from asignaturas where codigo ="+codigo+";");
    }
    
    public Asignatura consultarPorCodigo(int codigo) throws SQLException{
        Statement stm;
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from asignaturas where codigo = "+codigo+";");
        r.next();
        r.getInt("codigo");
        if(r.wasNull())
            throw new SQLException();

        return new Asignatura(r.getInt("codigo"), r.getString("descripcion"),r.getInt("anio"), 
                r.getString("turno"),r.getString("seccion"),r.getDate("fecha_ini"),r.getDate("fecha_fin"));
    }
    
    public LinkedList consultarAsignaturas() throws SQLException{
        Statement stm;
        LinkedList<Asignatura> asignaturas = new LinkedList();
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from asignaturas");
        r.next();
        r.getInt("codigo");
        if(r.wasNull())
            throw new SQLException();
        r.previous();
        while(r.next()){
            asignaturas.add(new Asignatura(r.getInt("codigo"), r.getString("descripcion"),r.getInt("anio"), 
                r.getString("turno"),r.getString("seccion"),r.getDate("fecha_ini"),r.getDate("fecha_fin")));
        }
        return asignaturas;
    }
    
    public LinkedList consultarAsignaturasPorAnio(int anio) throws SQLException{
        Statement stm;
        LinkedList<Asignatura> asignaturas = new LinkedList();
        stm = conexion.createStatement();
        ResultSet r = stm.executeQuery("select * from asignaturas where anio = "+anio);
        r.next();
        r.getInt("codigo");
        if(r.wasNull())
            throw new SQLException();
        r.previous();
        while(r.next()){
            asignaturas.add(new Asignatura(r.getInt("codigo"), r.getString("descripcion"),r.getInt("anio"), 
                r.getString("turno"),r.getString("seccion"),r.getDate("fecha_ini"),r.getDate("fecha_fin")));
        }
        return asignaturas;
    }
}
