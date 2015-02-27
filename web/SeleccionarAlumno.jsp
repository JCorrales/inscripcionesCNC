<%-- 
    Document   : SeleccionarAlumno
    Created on : 27/02/2015, 04:45:29 PM
    Author     : Acer Aspire
--%>

<%@page import="modelos.Alumno"%>
<%@page import="daos.AlumnoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscripciones</title>
    </head>
    <body>
        <jsp:include page="SeleccionarAlumnoForm.jsp"/>
        <%
            int cedula = new Integer(request.getParameter("cedula"));
            AlumnoDao dao = new AlumnoDao();
            try{
                Alumno alumno = dao.consultarPorCedula(cedula);
                if(alumno != null){
                    out.print("<br/>"+alumno.toString());
                }
                else{
                    out.print("<br/>"+"<text style=\"color:red\"> no existe el alumno con cedula: "+cedula+"</text>");
                }
                
            }catch(Exception ex){
                out.print("<br/><text style=\"color:red\">"+ex.getMessage()+"</text>");
            }
        %>
        
    </body>
</html>
