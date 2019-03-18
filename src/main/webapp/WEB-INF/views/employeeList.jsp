<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Employee List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

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
        </tr>
    </c:forEach>
</table>

</body>
</html>
