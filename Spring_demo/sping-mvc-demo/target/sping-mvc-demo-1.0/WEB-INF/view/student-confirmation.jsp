<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

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
        <br/><br/>
        Favorite Language: ${student.favoriteLanguage}
        <br/><br/>
        Operating system: 
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li> ${temp} </li>
            </c:forEach>
        </ul>
    </body>
</html>
