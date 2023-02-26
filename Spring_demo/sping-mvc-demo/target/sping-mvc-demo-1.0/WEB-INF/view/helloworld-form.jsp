<%-- 
    Document   : helloworld-form
    Created on : Jan 4, 2023, 9:38:54 AM
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
        <form action = "processForm" method = "GET">
            <input type = "text" name="studentName"
                   placeholder="What's your name?">
            <input type="submit" value = "submit">
        </form>
    </body>
</html>
