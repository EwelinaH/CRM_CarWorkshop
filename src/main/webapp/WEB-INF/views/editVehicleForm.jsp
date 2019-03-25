<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Edit Vehicle Form</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">

<form:form method="post" modelAttribute="vehicle">

    Car Brand:
    <form:input type="text" path="carBrand" /><br>

    Car Model:
    <form:input type="text" path="carModel" /><br>

    Next Inspection:
    <form:input type="date" path="nextInspection" /><br>

    Production Year:
    <form:input type="text" path="productionYear" /><br>

    Registration No:
    <form:input type="text" path="registrationNo" /><br>

    Customer Name:
    <form:select path="customer">
        <form:options items="${availableCustomers}" itemValue="id" itemLabel="customerSurname"/><br>
    </form:select>

    <input type="submit" value="save">

</form:form>

</div>

</body>
</html>

