<%-- 
    Document   : index
    Created on : 26/02/2015, 06:44:49 PM
    Author     : Acer Aspire
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%!
            Date theDate = new Date();
            Date getDate()
            {
                System.out.println( "In getDate() method" );
                return theDate;
            }
            %>
           Hello!  The time is now <%= getDate() %>
           <jsp:include page="InsertAlumnForm.jsp"></jsp:include>
        </h1>
    </body>
</html>
