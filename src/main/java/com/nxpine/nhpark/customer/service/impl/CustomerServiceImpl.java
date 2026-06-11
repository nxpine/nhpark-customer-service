package com.nxpark.service.service.impl;

import com.nxpark.service.model.Customer;
import com.nxpark.service.repository.CustomerRepository;
import com.nxpark.service.service.CustomerService;
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
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customerDetails) {
        return customerRepository.findById(id)
                .map(existingCustomer -> {
                    existingCustomer.setName(customerDetails.getName());
                    existingCustomer.setEmail(customerDetails.getEmail());
                    existingCustomer.setPhone(customerDetails.getPhone());
                    return customerRepository.save(existingCustomer);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }

    @Override
    public boolean deleteCustomer(Long id) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customerRepository.delete(customer);
                    return true;
                })
                .orElse(false);
    }
}
