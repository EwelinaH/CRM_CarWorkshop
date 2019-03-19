package com.ewelina.app.Orders;

import com.ewelina.app.Employee.Employee;
import com.ewelina.app.Employee.EmployeeRepository;
import com.ewelina.app.Vehicle.Vehicle;
import com.ewelina.app.Vehicle.VehicleRepository;
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

    @Autowired
    private VehicleRepository vehicleRepository;


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

    @GetMapping("/shortList")
    public String getShortList(Model model){
        List<Orders> ordersShort = ordersService.findAll();
        model.addAttribute("ordersShort", ordersShort);
        return "ordersShort";
    }

    @GetMapping("/inRepairList/{id}")
    public String getInRepairList(@PathVariable Long id, Model model){
        List<Orders> ordersInRepair = ordersRepository.findAllByEmployee_IdAndRepairStatus(id);
        model.addAttribute("ordersInRepair", ordersInRepair);
        return "inRepairList";
    }

    @GetMapping("/orderDetail/{id}")
    public String getOrderDetails(@PathVariable Long id, Model model){
        Orders orderDetail = ordersRepository.findOne(id);
        model.addAttribute("orderDetail", orderDetail);
        return "orderDetail";
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

    @ModelAttribute("availableVehicle")
    public List<Vehicle> getVehicle(){
        return this.vehicleRepository.findAll();
    }

}
