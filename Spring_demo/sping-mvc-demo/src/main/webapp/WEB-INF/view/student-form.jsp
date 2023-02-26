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
            First Name: <form:input path="firstName" placeholder="Enter your first name"/>
            <br/>
            Last Name: <form:input path="lastName" placeholder="Enter your last name"/>
            <br/>
            Country: 
            <form:select path="country">
                <!--
                - Use hard code:
                <form:option value="Brazil" label="Brazil" />
                <form:option value="VietNam" label="VietNam" selected="true"/>
                <form:option value="India" label="India" />
                <form:option value="USA" label="USA" />
                <form:option value="Mars" label="Mars" />
                -->

                <!--Use list in student class-->
                <form:options items="${student.countryOptions}"/>

            </form:select>

            <br/>
            Favorite Language: 
            <!--
            * radio button using hard code
            Java <form:radiobutton path="favoriteLanguage" value="Java"/>
            C# <form:radiobutton path="favoriteLanguage" value="C#"/>
            Python <form:radiobutton path="favoriteLanguage" value="Python"/>
            Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
            -->
            
            <!--Radio button using data binding from student class-->
            
            <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
            <br />
            
            Operation Systems: 
            Windown <form:checkbox path="operatingSystems" value="Windown" />
            Linux <form:checkbox path="operatingSystems" value="Linux" />
            MacOS <form:checkbox path="operatingSystems" value="MacOS" />
            
            <br/>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
