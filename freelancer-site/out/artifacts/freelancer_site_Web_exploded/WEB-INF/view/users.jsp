<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome to admin page</title>
</head>
<body>

    <h1>Administration - Users</h1>
    <a href="${pageContext.request.contextPath}/admin"> << Go back</a>
    <hr>

    <table border="1">
        <tr>
            <th>Id</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Gender</th>
            <th>Birthday</th>
            <th>email</th>
            <th>tel</th>
            <th>is freelancer?</th>
            <th>Address</th>
        </tr>

        <c:forEach var="user" items="${users}">

            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.gender}</td>
                <td>${user.birthday}</td>
                <td>${user.email}</td>
                <td>${user.tel}</td>
                <td>${user.isFreelancer}</td>
                <td>
                    <span id="address_a_${user.id}"
                          onclick="showAddress(${user.id})"
                          style="cursor: pointer; display: block;">
                        show
                    </span>

                    <div id="address_${user.id}"></div>
                </td>
            </tr>
        </c:forEach>

    </table>


    <script src="${pageContext.request.contextPath}/resources/js/getAddress.js"></script>


</body>
</html>
