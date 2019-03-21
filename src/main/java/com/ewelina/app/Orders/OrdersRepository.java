package com.ewelina.app.Orders;

import com.ewelina.app.Employee.Employee;
import com.ewelina.app.OrdersDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import javax.security.auth.callback.LanguageCallback;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Repository
@Transactional
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    @Query("select o from Orders o where o.employee.id = ?1")
    List<Orders> findAllByEmployee_Id (Long id);

    @Query("select o from Orders o where o.employee.id = ?1 and o.repairStatus = 'in repair' order by o.repairStartDate desc")
    List<Orders> findAllByEmployee_IdAndRepairStatus (Long id);

    @Query("select o from Orders o where o.vehicle.id = ?1 order by o.repairStartDate desc")
    List<Orders> findAllByVehicleId (Long id);


    @Query(value = "select new com.ewelina.app.OrdersDTO(e.employeeName, " +
            "e.employeeSurname, " +
            "sum(o.workingHours)) from " +
            "Orders o inner join Employee e on o.employee.id = e.id where " +
            "o.repairStartDate >= :repairStartDate and " +
            "o.repairEndingDate <= :repairEndingDate group by o.employee.id")
    List<OrdersDTO> findHourSumByEmployee(@Param("repairStartDate") LocalDate repairStartDate,
                                          @Param("repairEndingDate") LocalDate repairEndingDate);



}