package com.nxpine.nhpark.customer.service.impl;

import com.nxpine.nhpark.customer.domain.Customer;
import com.nxpine.nhpark.customer.repository.CustomerRepository;
import com.nxpine.nhpark.customer.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

   
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

   
}
