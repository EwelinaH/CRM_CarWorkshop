<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Edit Customer Form</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" modelAttribute="customer">

    Name:
    <form:input type="text" path="customerName" /><br>

    Surname:
    <form:input type="text" path="customerSurname" /><br>

    Birth Date:
    <form:input type="date" path="dateOfBirth" /><br>

    <input type="submit" value="save">

</form:form>


</body>
</html>

