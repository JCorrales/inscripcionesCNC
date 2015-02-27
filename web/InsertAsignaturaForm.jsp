<%-- 
    Document   : InsertAsignaturaForm
    Created on : 27/02/2015, 03:19:45 PM
    Author     : Acer Aspire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar asignatura</title>
    </head>
    <body>
        <h3>Ingrese los datos del alumno</h3>
        <FORM action="InsertAsignatura.jsp" method="post">
            <table>
                <tr>  <td>Codigo: </td><td><INPUT type="number" name="codigo" min="1" required></td></tr>
                <tr>  <td>Descripcion: </td><td><INPUT type="text" name="descripcion" maxlength="100"required></td></tr>
                <tr>  <td>Anio: </td><td><INPUT type="number" name="anio" min="2000" max="9999" required></td></tr>
                <tr>  <td>Turno: </td><td><INPUT type="text" name="turno" maxlength="1" required></td></tr>
                <tr>  <td>Seccion: </td><td><INPUT type="text" name="seccion" required maxlength="1"></td></tr>
                <tr>  <td>Fecha Inicio: </td><td><INPUT type="date" name="fecha_ini" required></td></tr>
                <tr>  <td>Fecha Fin: </td><td><INPUT type="date" name="fecha_fin" required></td></tr>
            </table>
            <INPUT type="submit" value="Insertar"> <INPUT type="reset">
         </FORM>
    </body>
</html>
