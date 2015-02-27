<%-- 
    Document   : SeleccionarAlumnoForm
    Created on : 27/02/2015, 04:43:14 PM
    Author     : Acer Aspire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscripciones</title>
    </head>
    <body>
        <h3>Ingrese la cedula del alumno</h3>
        <FORM action="SeleccionarAlumno.jsp" method="post">
            <table>
                <tr>  <td>Cedula: </td><td><INPUT type="number" name="cedula" min="1" required></td></tr>
            </table>
            <INPUT type="submit" value="Elegir"> <INPUT type="reset">
         </FORM>
    </body>
</html>
