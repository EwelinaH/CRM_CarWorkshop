<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Search Customer</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<form:form method="post" modelAttribute="customer">

    Search Customer By Surname:
    <form:input type="text" path="customerSurname"/><br>

    <%--Search Customer By Name:--%>
    <%--<form:input type="text" path="customerName"/><br>--%>
    <form:hidden path="customerName"/>
    <%--<form:hidden path="dateOfBirth"/>--%>

    <input type="submit" value="search">

</form:form>


</body>
</html>
