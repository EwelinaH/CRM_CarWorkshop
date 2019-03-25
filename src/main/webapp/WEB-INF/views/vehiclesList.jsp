<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Vehicles List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>
<div class="content">
    <a href="/vehicle/list">Vehicles list</a>
    <a href="/vehicle/add">Vehicle add</a>
</div><br>

<div class="content">

<table border="1">
    <tr>
        <th>Car Id</th>
        <th>Car Brand</th>
        <th>Car Model</th>
        <th>Next Inspection Date</th>
        <th>Production Year</th>
        <th>Registration Number</th>
        <th>Customer Id</th>
        <th>Customer Name</th>
        <th>Customer Surname</th>
        <th>Delete/ Update</th>
        <th>Vehicle Orders History</th>
    </tr>

    <c:forEach items="${vehicle}" var="vehicle">
        <tr>
            <td>${vehicle.id}</td>
            <td>${vehicle.carBrand}</td>
            <td>${vehicle.carModel}</td>
            <td>${vehicle.nextInspection}</td>
            <td>${vehicle.productionYear}</td>
            <td>${vehicle.registrationNo}</td>
            <td>${vehicle.customer.id}</td>
            <td>${vehicle.customer.customerName}</td>
            <td>${vehicle.customer.customerSurname}</td>
            <td>
                <a href="/vehicle/delete/${vehicle.id}">Delete</a>
                <a href="/vehicle/update/${vehicle.id}">Update</a>
            </td>

            <td>
                <a href="/vehicle/vehicleHistory/${vehicle.id}">Vehicle Orders History</a>
            </td>
        </tr>
    </c:forEach>
</table>

</div>
</body>
</html>
