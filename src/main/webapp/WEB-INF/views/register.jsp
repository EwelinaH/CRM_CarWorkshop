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
        <%--<form method="post">--%>

            <form:form method="post" modelAttribute="user">

                <%--<div class="container" >--%>

                    <%--<h3 class="header">Add User</h3>--%>

                    <%--<div class="card">--%>
                        <%--<div class="card-body">--%>


                            <div class="form-group">

                Login : <br><form:input type="text" path="userName"/><br>
                <form:errors path="userName" element="div" cssClass="error"/><br>
                            </div>

                            <div class="form-group">
                Password : <br><form:input type="password" path="password"/><br>
                <form:errors path="password" element="div" cssClass="error"/><br>
                            </div>

                            <div class="form-group">
                Email : <br><form:input type="text" path="email"/><br>
                <form:errors path="email" element="div" cssClass="error"/><br>
                            </div>
                <center>
                    <input type="submit" class="waves-effect waves-light btn" value="New User">
                </center>

                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            </form:form>

        <%--</form>--%>
    </div>
</div>
</div>
</body>
</html>