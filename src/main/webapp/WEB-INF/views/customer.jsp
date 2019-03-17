<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Customer</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" action="/customer/add" modelAttribute="customer">

    Name:
    <form:input type="text" path="customerName" value="Fiona"/><br>

    Surname:
    <form:input type="text" path="customerSurname" value="Kot"/><br>

    Birth Date:
    <form:input type="date" path="dateOfBirth" value="01/02/1989"/><br>

    <input type="submit" value="save">

</form:form>


</body>
</html>
