<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Edit Order Form</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" modelAttribute="orders">

    Component Cost:
    <form:input type="double"  path="componentsCost" /><br>

    Employee Man/Hour Cost:
    <form:input type="double" path="employeeManHour" /><br>

    Repair planned Start Date :
    <form:input type="date" path="plannedStartRepairDate" /><br>

    Problem Description:
    <form:input type="text" path="problemDesctiption" /><br>

    Putting To Repair Date:
    <form:input type="date" path="puttingToRepairDate" /><br>

    Repair Cost For Customer:
    <form:input type="double" path="repairCostForCustomer" /><br>

    Repair Description:
    <form:input type="text" path="repairDescription" /><br>

    Repair Start Date:
    <form:input type="date" path="repairStartDate" /><br>

    Repair Status:
    <form:input type="text" path="repairStatus" /><br>

    Working Hours:
    <form:input type="double" path="workingHours" /><br>

    Employee Name:
    <form:select path="employee">
        <form:options items="${availableEmployee}" itemValue="id" itemLabel="employeeSurname"/><br>
    </form:select>

    <input type="submit" value="save">

</form:form>


</body>
</html>

