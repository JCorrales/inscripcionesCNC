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
        <title>Insertar Alumno</title>
    </head>
    <body>
        <h3>Ingrese los datos del alumno</h3>
        <FORM action="InsertAlumn.jsp" method="post">
            <table>
                <tr>  <td>Cedula: </td><td><INPUT type="number" name="cedula" min="1" required></td></tr>
                <tr>  <td>Nombre: </td><td><INPUT type="text" name="nombre" required></td></tr>
                <tr>  <td>Apellido: </td><td><INPUT type="text" name="apellido" required></td></tr>
                <tr>  <td>Direccion: </td><td><INPUT type="text" name="direccion" required></td></tr>
                <tr>  <td>Telefono: </td><td><INPUT type="text" name="telefono" required></td></tr>
                <tr>  <td>Anio: </td><td><INPUT type="number" name="anio" min="2000" max="9999" required></td></tr>
            </table>
            <INPUT type="submit" value="Insertar"> <INPUT type="reset">
         </FORM>
    </body>
</html>
