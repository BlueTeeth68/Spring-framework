<%-- 
    Document   : student-confirmation
    Created on : Jan 6, 2023, 11:01:38 PM
    Author     : MINH TRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Confirmation Page</h1>
        <hr/>
        The student is confirm: ${student.firstName} ${student.lastName}
        <br/><br/>
        The student's country: ${student.country}
    </body>
</html>
