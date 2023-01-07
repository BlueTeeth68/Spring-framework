<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration form</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <hr/>
        <form:form action="processForm" modelAttribute="student">
            First Name: <form:input path="firstName"/>
            <br/>
            Last Name: <form:input path="lastName"/>
            <br/>
            Country: 
            <form:select path="country">
                <form:option value="Brazil" label="Brazil" />
                <form:option value="VietNam" label="VietNam" selected="true"/>
                <form:option value="India" label="India" />
                <form:option value="USA" label="USA" />
                <form:option value="Mars" label="Mars" />
            </form:select>
            <br/>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
