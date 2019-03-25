<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Customers List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">

    <table border="1">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Birth date</th>
            <th>ID</th>
        </tr>

        <tr>
            <td>${customerName}</td>
            <td>${customerSurname}</td>
            <td>${dateOfBirth}</td>
            <td>${id}</td>

            <td>
                <a href="/customer/delete/${customer.id}">Delete</a>
                <a href="/customer/update/${customer.id}">Update</a>
            </td>
        </tr>
    </table>

</div>

</body>
</html>
