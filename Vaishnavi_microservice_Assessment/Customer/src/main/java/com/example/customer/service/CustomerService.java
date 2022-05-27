package com.example.customer.service;

import java.util.List;



import com.example.customer.entities.Customer;



public interface CustomerService {



// Create
public Customer addCustomer(Customer customer);



// Retrieve all users
public List<Customer> getAllCustomers();
}