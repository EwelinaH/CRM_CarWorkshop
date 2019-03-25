<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Employee List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">
    <a href="/employee/add">Employee add</a>
    <a href="/employee/list">Employee list</a>
</div><br>

<div class="content">

<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Man/Hour Cost</th>
        <th>Note</th>
        <th>Phone</th>
        <th>Delete</th>
        <th>Update</th>
        <th>Employee orders</th>
        <th>Orders in repair</th>
        <th>Working hours report</th>
    </tr>

    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.employeeName}</td>
            <td>${employee.employeeSurname}</td>
            <td>${employee.manHourCost}</td>
            <td>${employee.note}</td>
            <td>${employee.phoneNumber}</td>
            <td>
                <a href="/employee/delete/${employee.id}">Delete</a>
            </td>
            <td>
                <a href="/employee/update/${employee.id}">Update</a>
            </td>
            <td>
                <a href="/employee/orderList/${employee.id}">Show employee orders</a>
            </td>

            <td>
                <a href="/orders/inRepairList/${employee.id}">Orders in repair</a>
            </td>

            <td>
                <a href="/employee/orderbydate?repairStartDate=2019%2F08%2F02&repairEndingDate=2019%2F08%2F10">Report</a>
            </td>

        </tr>
    </c:forEach>
</table>

</div>

</body>
</html>
