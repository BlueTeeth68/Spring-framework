<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Registration Form</title>

        <style>
            .error {
                color: red
            }
        </style>

    </head>
    <body>

        <i>Fill out the form. Asterisk (*) means required</i>
        <br/><br/>

        <form:form action="processForm" modelAttribute="customer">
            First Name: <form:input path="firstName" />

            <br /><br />

            Last Name (*): <form:input path="lastName" />
            <form:errors path="lastName" class="error" />

            <br /><br />

            Free Passes: <form:input path="freePasses"/>
            <form:errors path="freePasses" class = "error"/>

            <br /><br />

            Postal Code: <form:input path="postalCode"/>
            <form:errors path="postalCode" class = "error"/>

            <br /><br />

            Course Code: <form:input path="courseCode"/>
            <form:errors path="courseCode" class = "error"/>

            <br /><br />

            <input type="submit" value="Submit">
        </form:form>

    </body>
</html>
