package com.nxpark.service.service;

import com.nxpark.service.model.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer customerDetails);
    boolean deleteCustomer(Long id);
}

