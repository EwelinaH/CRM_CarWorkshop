package com.ewelina.app.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public void save(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public Vehicle find(Long id){
        return vehicleRepository.findOne(id);
    }

    public void update(Vehicle vehicle){
        vehicleRepository.save(vehicle);

    }

    public void delete(Long id){
        vehicleRepository.delete(id);
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }



}
