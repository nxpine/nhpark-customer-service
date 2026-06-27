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
    
    // Create customer
    @PostMapping
    public Customer create(@RequestBody Customer newCustomer) {
    	return customerService.createCustomer(newCustomer);
    	
    }
    
    //update customer
    
    @PatchMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
    	return customerService.updateCustomer(id, updatedCustomer);
    }
    
    //delete customer
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	customerService.deleteCustomer(id);
    }
    
    
   
}
