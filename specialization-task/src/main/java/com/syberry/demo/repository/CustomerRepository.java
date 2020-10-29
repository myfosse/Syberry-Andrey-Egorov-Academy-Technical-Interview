package com.syberry.demo.repository;

import com.syberry.demo.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class CustomerRepository {
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<>();

		customers.add(
			Customer
				.builder()
				.id(1)
				.name("Good boy")
				.build()
		);
		customers.add(
				Customer
					.builder()
					.id(2)
					.name("Good girl")
					.build()
		);
		customers.add(
				Customer
					.builder()
					.id(3)
					.name("Good dogo")
					.build()
		);

		return customers;
	}

	public Customer findFirst() {
		return Customer
			.builder()
			.id(1)
			.name("First One")
			.build();
	}

	/**
	 * Intentional empty body for saving imitation.
	 *
	 * @param customer customer
	 */
	public void save(Customer customer) {

	}
}
