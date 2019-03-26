<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<html>
<head>
    <title>Title</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>

<div class="content">

<div class="row">
    <div class="z-depth-3, col s4 offset-s4">
        <form:form method="post" modelAttribute="user">


            <div class="form-group">
                Login : <br><form:input type="text" path="userName" required="required"/><br>
                <form:errors path="userName" element="div" cssClass="error"/><br>
            </div>


            <div class="form-group">
                Password : <br><form:password path="password" cssClass="form-control" required="required"/><br>
                <form:errors path="password" cssClass="error"/>
            </div>

            <c:if test="${loginFailed == true}">
                <span>Login Failed!</span><br>
            </c:if>
            <center>
                <input type="submit" class="waves-effect waves-light btn" value="Log In">
            </center>

        </form:form>

        <center>
            <a href="/register" class="waves-effect waves-light btn">New User</a>
        </center>
    </div>
</div>
</div>

</body>
</html>