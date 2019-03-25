<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Income</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">

<form:form method="post" >

    From Date:
    <input type="text" name="repairStartDate" id="repairStartDate" value="2019/08/02">

    To Date:
    <input type="text" name="repairEndingDate" id="repairEndingDate" value="2019/08/10">

    <input type="submit" value="submit">

</form:form>

</div>

</body>
</html>

