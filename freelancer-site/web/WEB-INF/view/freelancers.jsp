<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Freelancers</title>
</head>
<body>

<h1>Administration - Freelancers</h1>
<a href="${pageContext.request.contextPath}/admin"> << Go back</a>
<hr>

<table border="1">
    <tr>
        <th>Freelancer Id</th>
        <th>User Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Experience</th>
        <th>Became freelancer</th>
        <th>Specialist type</th>
    </tr>


    <c:forEach var="freelancer" items="${freelancers}" varStatus="status">
        <tr>
            <td>${freelancer.id}</td>
            <td>${users.get(status.index).id}</td>
            <td>${users.get(status.index).firstName}</td>
            <td>${users.get(status.index).lastName}</td>
            <td>${freelancer.experience}</td>
            <td>${freelancer.becameFreelancer}</td>
            <td>${freelancer.specTable}</td>
        </tr>

    </c:forEach>

</table>



</body>
</html>
