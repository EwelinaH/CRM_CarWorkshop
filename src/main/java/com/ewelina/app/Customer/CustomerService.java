package com.ewelina.app.Customer;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public Customer find(Long id){
        return customerRepository.findOne(id);
    }

    public void update(Customer customer){
        customerRepository.save(customer);

    }

    public void delete(Long id){
        customerRepository.delete(id);
    }

    public Customer findWithVehicles(Long id){
        Customer customer = find(id);
        Hibernate.initialize(customer.getVehicles());
        return customer;
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }


}
