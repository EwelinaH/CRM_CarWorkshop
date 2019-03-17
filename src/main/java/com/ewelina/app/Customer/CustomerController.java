package com.ewelina.app.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDate;
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
    public String updateId(@PathVariable Long id, Model model){
        Customer customer = customerRepository.findOne(id);
        model.addAttribute("customer", customer);
        return "editCustomerForm";
    }

    @PostMapping("/update/{id}")
    public String updateId(@ModelAttribute Customer customer){
        customerService.update(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/update")
    public String update(@ModelAttribute Customer customer){
//        Customer customer = customerRepository.findOne(id);
//        model.addAttribute("customer", customer);
        return "editCustomerForm";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Customer customer, Model model){
//        Customer customer = customerRepository.findOne(id);
//        model.addAttribute("customer", customer);
        return "editCustomerForm";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        customerService.delete(id);
        return "redirect:/customer/list";
    }

//    @GetMapping("/find")
//    public String getCustomer(){
//        ModelAndView
//        return "searchCustomer";
//
//    }

    @GetMapping("/find")
//    public String findCustomerBySurname(@ModelAttribute Customer customer, String customerSurname, Model model){
    public String findCustomerBySurname(@ModelAttribute Customer customer){
//    public String findCustomerBySurname(){
//        Customer customer = customerRepository.findOne(id);
//        model.addAttribute("customer", customer);
//        model.addAttribute("customer", customerRepository.findByCustomerSurname(customerSurname));
//        Customer customer1 = customerRepository.findByCustomerSurname(customerSurname);
//        customerRepository
//        model.addAttribute("customer", customer);
//        model.addAttribute("customerName", "jozek");
        return "searchCustomer";
    }

//    @GetMapping("/find")
//    public String findCustomerBySurname(String customerSurname, Model model){
//        model.addAttribute("customer", customerRepository.findByCustomerSurname(customerSurname));
//        return "searchCustomer";
//    }

//
//    @GetMapping("/find")
//    public String findCustomer(@RequestParam(value="customerSurname", required = false) String customerSurname, Model model){
//        model.addAttribute("customerSurname", this.customerRepository.findByCustomerSurname(customerSurname));
//        return "searchCustomer";
//    }

//    @PostMapping("/find")
//    public String findCustomer(RedirectAttributes redirectAttributes, @ModelAttribute Customer customer, String customerSurname){
//        System.out.println("-----\n" +
//                this.customerRepository.findByCustomerSurname(customerSurname)
//        + "-------\n");
//        Customer customer2 = this.customerRepository.findByCustomerSurname(customerSurname);
////        System.out.println(this.customerRepository.findByCustomerSurname("Kot"));
//
////        model.addAttribute("customerSurname",
////                this.customerRepository.findByCustomerSurname("Kot"));
////        model.addAttribute("customerName", "test");
//        redirectAttributes.addAttribute("customerName", customer2.getCustomerName());
//        redirectAttributes.addAttribute("customerSurname", customer2.getCustomerSurname());
////        redirectAttributes.addAttribute("dateOfBirth", customer2.getDateOfBirth());
////        request.setAttribute("customerName", customer2.getCustomerName());
////        Customer customer = customerRepository.findByCustomerSurname("Kot");
//
////        model.addAttribute()
////        model.addAttribute("dateOfBirth", customer.getDateOfBirth());
////        model.addAttribute("id", this.customerRepository.findByCustomerSurname("Kot"));
////        model.addAttribute("id", 33);
//
//        return "redirect:/customer/update";
////        return "forward:editCustomerForm";
////        return "redirect:/customer/update/{id}";
//    }
//
//
    @PostMapping("/find")
    public String findCustomer(@ModelAttribute Customer customer, String customerSurname, Model model){
        System.out.println("-----\n" +
            this.customerRepository.findByCustomerSurname(customerSurname)
            + "-------\n");
        Customer customer2 = this.customerRepository.findByCustomerSurname(customerSurname);
//        System.out.println(this.customerRepository.findByCustomerSurname("Kot"));

//        model.addAttribute("customerSurname",
//                this.customerRepository.findByCustomerSurname("Kot"));
//        model.addAttribute("customerName", "test");
//        redirectAttributes.addAttribute("customerName", customer2.getCustomerName());
//        redirectAttributes.addAttribute("customerSurname", customer2.getCustomerSurname());
//        redirectAttributes.addAttribute("dateOfBirth", customer2.getDateOfBirth());
//        request.setAttribute("customerName", customer2.getCustomerName());
//        Customer customer = customerRepository.findByCustomerSurname("Kot");

//        model.addAttribute()
//        model.addAttribute("dateOfBirth", customer.getDateOfBirth());
//        model.addAttribute("id", this.customerRepository.findByCustomerSurname(customerSurname));
//        model.addAttribute("customer", customer2);

//        return "redirect:/customer/update";
//        return "forward:editCustomerForm";
        return "redirect:/customer/update/" + customer2.getId();
//        return "editCustomerForm";
}


}
