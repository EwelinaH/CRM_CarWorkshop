<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Employee List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">

<table border="1">
    <tr>
        <th>Total revenues for the period from ${repairStartDateLocal} to ${repairEndingDateLocal} PLN</th>

    </tr>
    <tr>
        <td align="center"> ${sumOfIncome}</td>
    </tr>
</table>
</div>
</body>
</html>