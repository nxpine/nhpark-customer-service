package com.nxpine.nhpark.customer.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpine.nhpark.customer.domain.Customer;
import com.nxpine.nhpark.customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	
	@GetMapping
	public List<Customer> getAll() {
		return customerService.getAllCustomers();
		
	}
	
	
}


