<%--
  Created by IntelliJ IDEA.
  User: ehsan
  Date: 10/17/2018
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Specialist</title>

    <style>
        .clickable {
            cursor: pointer;
        }
        .clickable:hover {
            color: blue;
        }

        #table {
            display: none;
        }
    </style>
</head>
<body>

<h1>Administration - Specialist</h1>
<a href="${pageContext.request.contextPath}/admin"> << Go back</a>
<hr>


<fieldset>
    <legend> Categories </legend>

    <div>
        <label class="clickable" onclick="getSpecByTableName('doctors')"><i>Doctors</i></label> |
        <label class="clickable" onclick="getSpecByTableName('groomers')"><i>Groomers</i></label> |
        <label class="clickable" onclick="getSpecByTableName('hairdressers')"><i>Hairdressers</i></label>
    </div>

</fieldset>

<br>
<br>

<table id="table" border="1">

</table>

<div id="footer">
    <script src="/${pageContext.request.contextPath}/resources/js/getSpecialist.js"></script>
</div>


</body>
</html>
