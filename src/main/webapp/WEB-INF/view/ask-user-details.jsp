<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 04.07.2023
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details form</title>
</head>
<body>
<h2>Hi, fill your details!</h2>

<%--<form action="show-user-details" method="get">--%>
<%--    <input type="text" name="userName" placeholder="Enter your name">--%>
<%--    <input type="submit">--%>
<%--</form>--%>

<form:form modelAttribute="employee" action="show-user-details" method="get">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Department
    <form:select path="department">
        <%--  using hardcode  --%>
        <%--        <form:option value="Sales" label="Sales"/>--%>
        <%--        <form:option value="IT" label="IT"/>--%>
        <%--        <form:option value="HR" label="HR"/>--%>

        <%--  using departments java object list  --%>
        <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Car Brands
    <form:radiobuttons path="carBrand" items="${employee.brands}"/>
    <br>
    Foreign languages
    <form:checkboxes path="languages" items="${employee.languagesOptions}"/>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <input type="submit" name="Submit"/>
</form:form>
</body>
</html>
