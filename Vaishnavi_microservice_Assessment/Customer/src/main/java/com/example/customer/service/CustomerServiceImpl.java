package com.example.customer.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.customer.entities.Customer;
import com.example.customer.repository.CustomerRepository;



@Service
public class CustomerServiceImpl implements CustomerService {



@Autowired
CustomerRepository customerrepo;



@Override
public Customer addCustomer(Customer customer) {
return customerrepo.save(customer);
}



@Override
public List<Customer> getAllCustomers() {
return (List<Customer>) customerrepo.findAll();
}



}