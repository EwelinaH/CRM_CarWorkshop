package com.ewelina.app.Vehicle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class VehicleConverter implements Converter<String, Vehicle> {

    @Autowired
    public VehicleService vehicleService;

    @Override
    public Vehicle convert(String source){
        if (source == null || source.isEmpty()){
            return  null;
        }
        Long id = Long.parseLong(source);
        return vehicleService.find(id);
    }
}
