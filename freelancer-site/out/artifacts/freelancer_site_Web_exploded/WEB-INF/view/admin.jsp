<%--
  Created by IntelliJ IDEA.
  User: ehsan
  Date: 10/16/2018
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>

<h1>Administration</h1>
<br>
<a href="${pageContext.request.contextPath}/"><< Go back to Home</a>
<hr>

<fieldset>
    <legend>Pages</legend>
    <a href="${pageContext.request.contextPath}/admin/users">All Users</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/admin/freelancers">Show only Freelancers</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/admin/specialist">Specialists</a>
</fieldset>


</body>
</html>
