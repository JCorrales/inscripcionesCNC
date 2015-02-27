/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Acer Aspire
 */
public class Asignatura {
    private int codigo;
    private String descripcion;
    private int anio;
    private String turno;
    private String seccion;
    private String fecha_ini;
    private String fecha_fin;

    public Asignatura() {
    }

    public Asignatura(int codigo, String descripcion, int anio, String turno, String seccion, String fecha_ini, String fecha_fin) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.turno = turno;
        this.seccion = seccion;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "codigo: "+codigo+"\n"+"descripcion: "+descripcion+"\n"+"anio: "+anio
                +"turno: "+turno+"\n"+"seccion: "+seccion+"\n"+"fecha_ini: "+fecha_ini
                +"\n"+"fecha_fin: "+fecha_fin; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
