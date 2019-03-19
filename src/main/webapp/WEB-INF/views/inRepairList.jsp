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
        <th>Repair Planned Start Date</th>
        <th>Problem Description</th>
        <th>Repair Start Date</th>
        <th>Repair Status</th>
        <th>Order details</th>
    </tr>

    <c:forEach items="${ordersInRepair}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.plannedStartRepairDate}</td>
            <td>${order.problemDesctiption}</td>
            <td>${order.repairStartDate}</td>
            <td>${order.repairStatus}</td>
            <td>
                <a href="/orders/delete/${order.id}">Delete</a>
                <a href="/orders/update/${order.id}">Update</a>
            </td>
            <td>
                <a href="/orders/orderDetail/${order.id}">Show Order details</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
