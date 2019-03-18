<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Edit Employee Form</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" modelAttribute="employee">

    Name:
    <form:input type="text" path="employeeName" /><br>

    Surname:
    <form:input type="text" path="employeeSurname" /><br>

    Man/Hours Cost:
    <form:input type="double" path="manHourCost" /><br>

    Note:
    <form:input type="text" path="note" /><br>

    Phone:
    <form:input type="number" path="phoneNumber" /><br>

    <input type="submit" value="save">

</form:form>


</body>
</html>

