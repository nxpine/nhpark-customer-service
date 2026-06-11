package com.nxpine.nhpark.customer.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prime.oms.product.domain.ProductEntity;
import com.prime.oms.product.service.ProductService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	
	@GetMapping
	public List<CustomerEntity> getAll() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping("{id}")
	public CustomerEntity get(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}
	
	@PostMapping
	public void create(@RequestBody CustomerEntity product) {
		customerService.create(customer);
	}
	
	@PatchMapping("{id}")
	public void update(@PathVariable Long id, @RequestBody CustomerEntity product) {
		customerService.update(id, customer);
	}
		
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		customerService.delete(id);
	}
	
}


