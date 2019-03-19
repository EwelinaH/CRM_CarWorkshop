package com.ewelina.app.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
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


}