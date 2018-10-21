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

    <form:form action="/sign-up/save-user" modelAttribute="user" method="POST">

        <label>First name: </label>
        <form:input path="firstName" placeholder="Dana" />
        <br>
        <br>
        <label>Last name: </label>
        <form:input path="lastName" placeholder="Vovk" />
        <br>
        <br>
        <label>Gender: </label>
        <form:radiobutton path="gender" value="M" label="Male" /> |
        <form:radiobutton path="gender" value="F" label="Female" checked="checked" />
        <br>
        <br>
        <label>Birthday</label>
        <form:input type="date" path="birthday" />
        <br>
        <br>
        <label>Email: </label>
        <form:input path="email" type="email" placeholder="dana@mail.com" />
        <br>
        <br>
        <label>Telephone: </label>
        <form:input path="tel" placeholder="380967060606" />
        <br>
        <br>
        <label>Do you want to become freelancer?</label>
        <form:radiobutton path="isFreelancer" value="T" label="Yes" /> |
        <form:radiobutton path="isFreelancer" value="F" label="No" />
        <br>
        <br>
        <input type="submit" value="Submit" />
    </form:form>






</body>
</html>
