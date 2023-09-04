package com.java.instructor.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.instructor.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
