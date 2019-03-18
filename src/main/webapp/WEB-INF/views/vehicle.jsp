<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Vehicle</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" modelAttribute="vehicle">

    Car Brand:
    <form:input type="text"  path="carBrand"  value="Audi"/><br>

    Car Model:
    <form:input type="text" path="carModel" value="A6"/><br>

    Next Inspection Date:
    <form:input type="date" path="nextInspection" value="01/02/2020"/><br>

    Production Date:
    <form:input type="text" path="productionYear" value="2014"/><br>

    Registration Number:
    <form:input type="text" path="registrationNo" value="KR5T897"/><br>

    Customer Name:
    <form:select path="customer">
        <form:options items="${availableCustomers}" itemValue="id" itemLabel="customerSurname"/><br>
    </form:select>

    <input type="submit" value="save">

</form:form>


</body>
</html>
