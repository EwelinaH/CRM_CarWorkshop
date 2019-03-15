package com.ewelina.app.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class EmployeeConverter implements Converter<String, Employee> {

    @Autowired
    public EmployeeService employeeService;

    @Override
    public Employee convert(String source){
        if(source == null || source.isEmpty()){
            return null;
        }
        Long id = Long.parseLong(source);
        return employeeService.find(id);
    }
}
