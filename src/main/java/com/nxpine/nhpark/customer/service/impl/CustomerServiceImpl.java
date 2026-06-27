package com.nxpine.nhpark.customer.service.impl;

import com.nxpine.nhpark.customer.domain.Customer;
import com.nxpine.nhpark.customer.repository.CustomerRepository;
import com.nxpine.nhpark.customer.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found: " + id));
    }

	@Override
	public Customer createCustomer(Customer newCustomer) {
		return customerRepository.save(newCustomer);
	}


	@Override
	public Customer updateCustomer(Long id, Customer updatedCustomer) {
		return customerRepository.save(updatedCustomer);
	}


	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);		
	}
   
}
