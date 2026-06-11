package com.nxpark.service.repository;

import com.nxpark.service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Standard CRUD methods are automatically provided by JpaRepository
}
