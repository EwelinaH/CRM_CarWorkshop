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
        <th>Employee Name</th>
        <th>Employee Surname</th>
        <th>Total employee working hours for the period from ${repairStartDateLocal} to ${repairEndingDateLocal}</th>

    </tr>

    <c:forEach items="${employeeWorkingHours}" var="employee">
        <tr>
            <td align="center">${employee.employeeName}</td>
            <td align="center">${employee.employeeSurname}</td>
            <td align="center">${employee.workingHours}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>