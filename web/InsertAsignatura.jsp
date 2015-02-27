<%-- 
    Document   : InsertAsignatura
    Created on : 27/02/2015, 03:20:04 PM
    Author     : Acer Aspire
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="daos.AsignaturaDao"%>
<%@page import="modelos.Asignatura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Asignatura</title>
    </head>
    <body>
        <jsp:useBean id="asignatura" class="modelos.Asignatura" scope="session"></jsp:useBean>
            <jsp:include page="InsertAsignaturaForm.jsp"/>
            <%
                int codigo = new Integer(request.getParameter("codigo"));
                String descripcion = request.getParameter("descripcion");
                int anio = new Integer(request.getParameter("anio"));
                String turno = request.getParameter("turno");
                String seccion = request.getParameter("seccion");
                java.util.Date fecha_ini_util = new SimpleDateFormat("yyyy-MM-dd").
                        parse(request.getParameter("fecha_ini"));
                java.sql.Date fecha_ini = new Date(fecha_ini_util.getTime());
                
                java.util.Date fecha_fin_util = new SimpleDateFormat("yyyy-MM-dd").
                        parse(request.getParameter("fecha_fin"));
                java.sql.Date fecha_fin = new Date(fecha_fin_util.getTime());
                asignatura = new Asignatura(codigo, descripcion, anio, turno, seccion, fecha_ini, fecha_fin);
                try{
                    AsignaturaDao dao = new AsignaturaDao();
                    dao.insert(asignatura);
                    out.print("<br/><text>asignatura insertada correctamente</text>");
                }catch(Exception ex){
                    out.print("<br/><text style=\"color:red\">"+ex.getMessage()+"</text>");
                }
            %>
    </body>
</html>
