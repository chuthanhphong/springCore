package com.example.demo.demoDI.controller;


import com.example.demo.demoDI.model.Customer;
import com.example.demo.demoDI.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/list")
    public ResponseEntity<Iterable<Customer>> findAll(){
      Iterable<Customer> customerList =  customerService.findAll();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        customerService.save(customer);
        return new ResponseEntity(customerService.findById(customer.getId()),HttpStatus.CREATED);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Customer> edit(@PathVariable Long id,@RequestBody Customer customer){
        Optional<Customer> userOptional = customerService.findById(id);
        if(!userOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        customer.setId(id);
        customerService.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Customer> delete(@PathVariable Long id){
        customerService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
