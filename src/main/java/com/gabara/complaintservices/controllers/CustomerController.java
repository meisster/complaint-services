package com.gabara.complaintservices.controllers;

import com.gabara.complaintservices.repositories.CustomerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customer")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());

        return model.toString();
    }
}
