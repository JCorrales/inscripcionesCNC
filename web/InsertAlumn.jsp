<%-- 
    Document   : test
    Created on : 26/02/2015, 09:35:52 PM
    Author     : Acer Aspire
--%>

<%@page import="daos.AlumnoDao"%>
<%@page import="modelos.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Alumno</title>
    </head>
    <body>
            <jsp:useBean id="alumno" class="modelos.Alumno" scope="session"></jsp:useBean>
            <jsp:setProperty name="alumno" property="*"/>
            <jsp:include page="InsertAlumnForm.jsp"/>
            <%
                try{
                    AlumnoDao dao = new AlumnoDao();
                    dao.insert(alumno);
                    out.print("<br/><text>alumno insertada correctamente</text>");
                }catch(Exception ex){
                    out.print("<br/><text style=\"color:red\">"+ex.getMessage()+"</text>");
                }
            %>
            
    </body>
</html>
