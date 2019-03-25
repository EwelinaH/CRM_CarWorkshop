<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Employee</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">

<form:form method="post" modelAttribute="employee">

    Name:
    <form:input type="text"  path="employeeName"  value="Marian"/><br>

    Surname:
    <form:input type="text" path="employeeSurname" value="Nowak"/><br>

    Man/Hour Cost:
    <form:input type="double" path="manHourCost" value="20.0"/><br>

    Note:
    <form:input type="text" path="note" value="brak"/><br>

    Phone:
    <form:input type="number" path="phoneNumber" value="728678540"/><br>

    <input type="submit" value="save">

</form:form>

</div>
</body>
</html>
