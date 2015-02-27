<%-- 
    Document   : AlumnosForm
    Created on : 26/02/2015, 09:07:53 PM
    Author     : Acer Aspire
--%>

<%@page import="modelos.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <FORM action="InsertAlumn.jsp" method="post">
            <P>
             <LABEL for="cedula">Cedula: </LABEL>
                  <INPUT type="number" name="cedula"><BR>
            <LABEL for="nombre">Nombre: </LABEL>
                      <INPUT type="text" name="nombre"><BR>
            <LABEL for="apellido">Apellido: </LABEL>
                      <INPUT type="text" name="apellido"><BR>
            <LABEL for="direccion">Direccion: </LABEL>
                      <INPUT type="text" name="direccion"><BR>
            <LABEL for="telefono">Telefono: </LABEL>
                      <INPUT type="text" name="telefono"><BR>
            <LABEL for="anio">año: </LABEL>
                      <INPUT type="text" name="anio"><BR>
            <INPUT type="submit" value="Insertar"> <INPUT type="reset">
            </P>
         </FORM>
    </body>
</html>
