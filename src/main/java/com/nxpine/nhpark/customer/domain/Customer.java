package com.nxpine.nhpark.customer.domain;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String email;

    @Column
    private LocalDate dob;

    @Column
    private String gender;
    
    @Column(name = "phone_number")
    private String phoneNumber;
    
    public int getAge() {
     return Period.between(this.dob, LocalDate.now()).getYears(); 	
    }
}

