package com.syberry.demo.service;

import com.syberry.demo.entity.Customer;
import java.util.List;

public interface CustomerService {

	List<Customer> findAll();

	Customer findFirst();

	Customer create(String name);

}
