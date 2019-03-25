<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Search Customer</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>
<div class="content">

<form:form  method="post">

    Search Customer By Surname:
    <%--<form:input type="text" path="customerSurname"/><br>--%>
    <input type="text" name="customerSurname" id="customerSurname" class="form-control" value="Kot">
    <input type="submit" value="search">

</form:form>

</div>
</body>
</html>
