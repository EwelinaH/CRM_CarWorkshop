package com.ewelina.app.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
