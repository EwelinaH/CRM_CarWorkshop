package com.ewelina.app.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;


    @GetMapping("/add")
    public String addCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @PostMapping("/add")
    public String addCustomer(@ModelAttribute Customer customer){
            customerService.save(customer);
            return "redirect:/customer/list";
    }

    @GetMapping("/list")
    public String getList(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customersList";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        Customer customer = customerRepository.findOne(id);
        model.addAttribute("customer", customer);
        return "editCustomerForm";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute Customer customer){
        customerService.update(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        customerService.delete(id);
        return "redirect:/customer/list";
    }
}
