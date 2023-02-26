<%-- 
    Document   : index
    Created on : Jan 3, 2023, 10:15:13 AM
    Author     : MINH TRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .link a {
                text-decoration: none;
            }
            
            .link a:hover {
                color: blue;
                font-weight: bold;
            }
        </style>
        
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="link">
        <a href="hello/showForm" title="Go to hello form page" target="_blank">Hello World Form </a>
        <br/><br/>
        <a href="student/showForm" title="Go to student form page" target="_blank">Student Form </a>
        <br/><br/>
        <a href="customer/showForm" title="Go to customer form page" target="_blank">Customer</a>
        </div>
    </body>
</html>
