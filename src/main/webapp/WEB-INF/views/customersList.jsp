<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Customers List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<table border="1">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Birth date</th>
        <th>ID</th>
        <th>Delete</th>
        <th>Update</th>
        <th>Customer vehicle</th>
    </tr>

    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.customerName}</td>
            <td>${customer.customerSurname}</td>
            <td>${customer.dateOfBirth}</td>
            <td>${customer.id}</td>

            <td>
                <a href="/customer/delete/${customer.id}">Delete</a>
            </td>
            <td>
                <a href="/customer/update/${customer.id}">Update</a>
            </td>

            <td>
                <a href="/customer/vehicleList/${customer.id}">Show vehicles</a>
            </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
