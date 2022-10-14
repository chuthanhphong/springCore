package com.example.demo.demoDI.service;

import com.example.demo.demoDI.model.Customer;
import com.example.demo.demoDI.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements IGenaralService<Customer> {

    //Field injection
    @Autowired
    private CustomerRepository customerRepository;

//    public CustomerService(CustomerRepository customerRepository) {
//        // constructor injction
//        this.customerRepository = customerRepository;
//    }


    //setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}
