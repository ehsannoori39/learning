<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Freelancer - Sign up</title>
</head>
<body>

<h1>Sign up</h1>
<a href="${pageContext.request.contextPath}/"><< Go Back Home</a>
<hr>

    <form:form action="/signup/save-user-location" modelAttribute="userLocation" method="POST">

        <label>Country: </label>
        <form:input path="country" placehodler="Ukraine"/>
        <br>
        <br>
        <label>City: </label>
        <form:input path="city" placehodler="Kiev"/>
        <br>
        <br>
        <label>Region: </label>
        <form:input path="region" placehodler="salomenski"/>
        <br>
        <br>
        <label>Street: </label>
        <form:input path="street" placehodler="khershatik"/>
        <br>
        <br>
        <label>Building Number: </label>
        <form:input path="buildingNum" placehodler="48"/>
        <br>
        <br>
        <label>Office Number</label>
        <form:input path="officeNum" placehodler="110"/>
        <br>
        <br>

        <input type="submit" value="Sign up" />
    </form:form>






</body>
</html>
