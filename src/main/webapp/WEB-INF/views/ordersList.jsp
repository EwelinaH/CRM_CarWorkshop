<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Order List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<table border="1">
    <tr>
        <th>Order ID</th>
        <th>Component Cost</th>
        <th>Employee Man/Hour Cost</th>
        <th>Repair Planned Start Date</th>
        <th>Problem Description</th>
        <th>Putting To Repair Date</th>
        <th>Repair Cost For Customer</th>
        <th>Repair Description</th>
        <th>Repair Start Date</th>
        <th>Repair Status</th>
        <th>Working Hours</th>
        <th>Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Surname</th>
        <th>Vehicle Id</th>
        <th>Vehicle CarBrand</th>
        <th>Vehicle Registration</th>
    </tr>

    <c:forEach items="${orders}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.componentsCost}</td>
            <td>${order.employeeManHour}</td>
            <td>${order.plannedStartRepairDate}</td>
            <td>${order.problemDesctiption}</td>
            <td>${order.puttingToRepairDate}</td>
            <td>${order.repairCostForCustomer}</td>
            <td>${order.repairDescription}</td>
            <td>${order.repairStartDate}</td>
            <td>${order.repairStatus}</td>
            <td>${order.workingHours}</td>
            <td>${order.employee.id}</td>
            <td>${order.employee.employeeName}</td>
            <td>${order.employee.employeeSurname}</td>
            <td>${order.vehicle.id}</td>
            <td>${order.vehicle.carBrand}</td>
            <td>${order.vehicle.registrationNo}</td>
            <td>
                <a href="/orders/delete/${order.id}">Delete</a>
                <a href="/orders/update/${order.id}">Update</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
