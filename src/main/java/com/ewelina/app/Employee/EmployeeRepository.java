package com.ewelina.app.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
