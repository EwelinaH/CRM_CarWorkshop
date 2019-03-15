package com.ewelina.app.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee find(Long id){
       return employeeRepository.findOne(id);
    }

    public void uodate(Employee employee){
        employeeRepository.save(employee);
    }

    public void delete(Long id){
        employeeRepository.delete(id);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
