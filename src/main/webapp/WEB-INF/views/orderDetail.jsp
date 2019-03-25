<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Order List</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jspf.jsp"%>

<div class="content">

<table border="1">
    <tr>
        <th>Order ID</th>
        <th>Component Cost</th>
        <th>Employee Man/Hour Cost</th>
        <th>Repair Planned Start Date</th>
        <th>Problem Description</th>
        <th>Putting To Repair Date</th>
        <th>Repair Cost For Customer</th>
        <th>Repair Description</th>
        <th>Repair Start Date</th>
        <th>Repair Ending Date</th>
        <th>Repair Status</th>
        <th>Working Hours</th>
        <th>Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Surname</th>
        <th>Vehicle Brand</th>
        <th>Vehicle Registration</th>
    </tr>

        <tr>
            <td>${orderDetail.id}</td>
            <td>${orderDetail.componentsCost}</td>
            <td>${orderDetail.employeeManHour}</td>
            <td>${orderDetail.plannedStartRepairDate}</td>
            <td>${orderDetail.problemDesctiption}</td>
            <td>${orderDetail.puttingToRepairDate}</td>
            <td>${orderDetail.repairCostForCustomer}</td>
            <td>${orderDetail.repairDescription}</td>
            <td>${orderDetail.repairStartDate}</td>
            <td>${orderDetail.repairEndingDate}</td>
            <td>${orderDetail.repairStatus}</td>
            <td>${orderDetail.workingHours}</td>
            <td>${orderDetail.employee.id}</td>
            <td>${orderDetail.employee.employeeName}</td>
            <td>${orderDetail.employee.employeeSurname}</td>
            <td>${orderDetail.vehicle.carBrand}</td>
            <td>${orderDetail.vehicle.registrationNo}</td>
            <td>
                <a href="/orders/delete/${orderDetail.id}">Delete</a>
                <a href="/orders/update/${orderDetail.id}">Update</a>
            </td>
        </tr>
</table>

</div>


</body>
</html>
