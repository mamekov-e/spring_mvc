<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 04.07.2023
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User details</title>
</head>
<body>
<h1>Welcome to page!</h1>
<%--<p>--%>
<%--  get data from url param  --%>
<%--    ${param.userName}!--%>

<%--  get data from model attribute  --%>
<%--    ${nameAttr}--%>
<%--</p>--%>

<%--  get data from ModelAttribute annotation  --%>
<p>Your name: ${employee.name}</p>
<p>Your surname: ${employee.surname}</p>
<p>Your salary: ${employee.salary}</p>
<p>Your department: ${employee.department}</p>
<p>Your car brand: ${employee.carBrand}</p>
Your languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
Your phoneNumber: ${employee.phoneNumber}
Your email: ${employee.email}

</body>
</html>
