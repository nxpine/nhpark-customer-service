package com.nxpine.nhpark.customer.service;

import java.util.List;

import com.nxpine.nhpark.customer.domain.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();

	Customer getCustomerById(Long id);

	Customer createCustomer(Customer newCustomer);

	Customer updateCustomer(Long id, Customer updatedCustomer);

	void deleteCustomer(Long id);
    
}

	