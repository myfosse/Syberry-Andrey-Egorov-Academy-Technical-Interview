package com.syberry.demo.service;

import com.syberry.demo.entity.Customer;
import com.syberry.demo.repository.CustomerRepository;
import java.util.List;
import java.util.Random;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findFirst() {
		return customerRepository.findFirst();
	}

	@Override
	public Customer create(String name) {
		Customer customer = Customer.builder()
									.id(new Random().nextInt())
									.name(name)
									.build();
		customerRepository.save(customer);
		return customer;
	}
}
