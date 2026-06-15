package com.nxpine.nhpark.customer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.nxpine.nhpark.customer.domain.Customer;
import com.nxpine.nhpark.customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }
}

