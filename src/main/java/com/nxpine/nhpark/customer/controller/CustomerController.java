package com.nxpine.nhpark.customer.controller;

import org.springframework.web.bind.annotation.*;
import com.nxpine.nhpark.customer.domain.Customer;
import com.nxpine.nhpark.customer.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // GET all customers
    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }

    // GET customer by ID
    @GetMapping("/{id}")
    public Customer get(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
}
