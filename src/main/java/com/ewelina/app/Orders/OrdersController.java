package com.ewelina.app.Orders;

import com.ewelina.app.Employee.Employee;
import com.ewelina.app.Employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/add")
    public String addVehicle(Model model){
        model.addAttribute("orders", new Orders());
        return "orders";
    }

    @PostMapping("/add")
    public String addVehicle(@ModelAttribute Orders orders){
        this.ordersService.save(orders);
        return "redirect:/orders/list";
    }

    @GetMapping("/list")
    public String getList(Model model){
        List<Orders> orders = ordersService.findAll();
        model.addAttribute("orders", orders);
        return "ordersList";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        Orders orders = ordersRepository.findOne(id);
        model.addAttribute("orders", orders);
        return "editOrderForm";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute Orders orders){
        ordersService.update(orders);
        return "redirect:/orders/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        ordersService.delete(id);
        return "redirect:/orders/list";
    }

    @ModelAttribute("availableEmployee")
    public List<Employee> getEmployee(){
        return this.employeeRepository.findAll();
    }




}
