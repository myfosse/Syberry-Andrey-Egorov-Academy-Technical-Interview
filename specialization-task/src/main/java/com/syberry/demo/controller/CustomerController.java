package com.syberry.demo.controller;

import com.syberry.demo.entity.Customer;
import com.syberry.demo.service.CustomerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class CustomerController {

	private final CustomerService customerService;

	@GetMapping(path = "/customers")
	@ResponseBody
	public List<Customer> customerList() {
		return customerService.findAll();
	}

	@GetMapping(path = "/customer")
	@ResponseBody
	public Customer firstCustomer() {
		/**
		 * TODO : Write your code after this comment
		 */
		return customerService.findFirst();
	}

	@PostMapping(path = "/customer/{name}")
	@ResponseBody
	public Customer createCustomer(@PathVariable String name) {
		/**
		 * TODO : Write your code after this comment
		 */
		return customerService.create(name);
	}
}
