package com.nxpine.nhpark.customer.repository;

import com.nxpine.nhpark.customer.domain.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepository extends JpaRepository<Addresses, Long> {
}