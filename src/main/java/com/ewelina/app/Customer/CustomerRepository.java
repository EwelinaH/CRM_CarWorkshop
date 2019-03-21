package com.ewelina.app.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {


//    @Query("select c from Customer c where c.customerSurname = ?1")
    @Query("select c from Customer c where c.customerSurname = ?1")
//    List<Customer> findBySurname(String customerSurname);
    List<Customer> findByCustomerSurname(String customerSurname);

}
