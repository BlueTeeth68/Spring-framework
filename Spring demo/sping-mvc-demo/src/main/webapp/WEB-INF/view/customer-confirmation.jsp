<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Confirmation</title>
    </head>
    <body>
        <h1>Confirmation Page</h1>
        <hr/>
        Customer Name: ${customer.firstName} ${customer.lastName} 
        <br/><br/>
        Free Passes: ${customer.freePasses}
        <br/><br/>
        Postal Code: ${customer.postalCode}
        <br/><br/>
        Course Code: ${customer.courseCode}
    </body>
</html>
