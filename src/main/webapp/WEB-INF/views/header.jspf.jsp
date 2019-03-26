<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <style>
        body {
            margin: 0;
        }

        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 15%;
            background-color: #f1f1f1;
            position: absolute;
            height: 100%;
            overflow: auto;
        }

        li a {
            display: block;
            color: #000;
            padding: 8px 16px;
            text-decoration: none;
        }

        li a {
            background-color: #4CAF50;
            color: white;
        }

        li a:hover:not {
            background-color: #555;
            color: white;
        }

        .content {
            position: absolute;
            left: 17%;
        }
        .form-control {
            display: block;
            font-size:11px;
            padding:4px 2px;
            border:solid 1px #aacfe4;
            width:100px;
            margin:2px 2px 10px 0px;
        }


    </style>
</head>
<body>

<ul>
    <li><a href="/home">Home</a></li>
    <li><a href="/customer/list">Customers</a></li>
    <li><a href="/vehicle/list">Vehicles</a></li>
    <li><a href="/employee/list">Employees</a></li>
    <li><a href="/orders/list">Orders</a></li>
    <li><a href="/employee/report">Work report</a></li>
    <li><a href="/employee/income">Income report</a></li>

    <c:if test="${login == true}">
        <li><a href="/logout" class="waves-effect waves-light btn">Logout</a></li>
    </c:if>

</ul>

</body>

</html>
