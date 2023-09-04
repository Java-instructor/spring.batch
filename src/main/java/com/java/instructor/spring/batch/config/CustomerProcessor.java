package com.java.instructor.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.java.instructor.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	public Customer process(Customer customer) throws Exception {
		return customer;
	}
	
	

}
