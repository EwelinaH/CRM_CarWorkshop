package com.ewelina.app.Vehicle;

import com.ewelina.app.Customer.Customer;
import com.ewelina.app.Customer.CustomerRepository;
import com.ewelina.app.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/add")
    public String addVehicle(Model model){
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle";
    }

    @PostMapping("/add")
    public String addVehicle(@ModelAttribute Vehicle vehicle){
        this.vehicleService.save(vehicle);
        return "redirect:/vehicle/list";
    }

    @GetMapping("/list")
    public String getList(Model model){
        List<Vehicle> vehicle = vehicleService.findAll();
        model.addAttribute("vehicle", vehicle);
        return "vehiclesList";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        Vehicle vehicle = vehicleRepository.findOne(id);
        model.addAttribute("vehicle", vehicle);
        return "editVehicleForm";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute Vehicle vehicle){
        vehicleService.update(vehicle);
        return "redirect:/vehicle/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        vehicleService.delete(id);
        return "redirect:/vehicle/list";
    }

    @ModelAttribute("availableCustomers")
    public List<Customer> getCustomers(){
        return this.customerRepository.findAll();
    }

    @GetMapping("/findVehiclesByCustomer")
    @ResponseBody
    public String findVehiclesByCustomer(@ModelAttribute Long id, Model model){
        List<Vehicle> vehicles = vehicleRepository.findAllByCustomer_Id(id);
        model.addAttribute("vehicles", vehicles);
        return vehicles.toString();
//        return "vehiclesList";
    }

//    @GetMapping("/list")
//    public String getList(Model model){
//        List<Vehicle> vehicle = vehicleService.findAll();
//        model.addAttribute("vehicle", vehicle);
//        return "vehiclesList";
//    }

}
