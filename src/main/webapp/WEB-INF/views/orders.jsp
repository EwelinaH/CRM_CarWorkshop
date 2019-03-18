<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Orders</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" modelAttribute="orders">

    Component Cost:
    <form:input type="double"  path="componentsCost"  value="250.50"/><br>

    Employee Man/Hour Cost:
    <form:input type="double" path="employeeManHour" value="20.6"/><br>

    Repair planned Start Date :
    <form:input type="date" path="plannedStartRepairDate" value="01/04/2019"/><br>

    Problem Description:
    <form:input type="text" path="problemDesctiption" value="uszkodzone drzwi"/><br>

    Putting To Repair Date:
    <form:input type="date" path="puttingToRepairDate" value="02/08/2019"/><br>

    Repair Cost For Customer:
    <form:input type="double" path="repairCostForCustomer" value="271.1"/><br>

    Repair Description:
    <form:input type="text" path="repairDescription" value="naprawa drzwi"/><br>

    Repair Start Date:
    <form:input type="date" path="repairStartDate" value="02/08/2019"/><br>

    Repair Status:
    <form:input type="text" path="repairStatus" value="in repair"/><br>

    Working Hours:
    <form:input type="double" path="workingHours" value="12.5"/><br>

    Employee Name:
    <form:select path="employee">
        <form:options items="${availableEmployee}" itemValue="id" itemLabel="employeeSurname"/><br>
    </form:select>

    <input type="submit" value="save">

</form:form>


</body>
</html>
