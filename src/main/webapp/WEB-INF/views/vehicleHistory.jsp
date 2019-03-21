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
        <th>Problem Description</th>
        <th>Repair Description</th>
        <th>Repair Start Date</th>
        <th>Repair Ending Date</th>
    </tr>

    <c:forEach items="${vehicleHistory}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.problemDesctiption}</td>
            <td>${order.repairDescription}</td>
            <td>${order.repairStartDate}</td>
            <td>${order.repairEndingDate}</td>
            <td>
                <a href="/orders/delete/${order.id}">Delete</a>
                <a href="/orders/update/${order.id}">Update</a>
            </td>
            <td>
                <a href="/orders/orderDetail/${order.id}">Show Order Details</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
