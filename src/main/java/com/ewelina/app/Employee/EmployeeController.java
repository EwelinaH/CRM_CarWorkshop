package com.ewelina.app.Employee;

import com.ewelina.app.Orders.Orders;
import com.ewelina.app.Orders.OrdersRepository;
import com.ewelina.app.Vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping("/add")
    public String addEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "employee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee){
        this.employeeService.save(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/list")
    public String getList(Model model){
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        Employee employee = employeeRepository.findOne(id);
        model.addAttribute("employee", employee);
        return "editEmployeeForm";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute Employee employee){
        employeeService.save(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        employeeService.delete(id);
        return "redirect:/employee/list";
    }

    @GetMapping("/orderList/{id}")
    public String getVehicleList(@PathVariable Long id, Model model){
        List<Orders> orders = ordersRepository.findAllByEmployee_Id(id);
        model.addAttribute("orders", orders);
        return "ordersList";
    }

}
