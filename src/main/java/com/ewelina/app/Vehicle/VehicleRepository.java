package com.ewelina.app.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query("select v from Vehicle v where v.customer.id = ?1")
    List<Vehicle> findAllByCustomer_Id (Long id);

}
