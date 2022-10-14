package com.example.demo.demoDI.service;

import com.example.demo.demoDI.model.Customer;

import java.util.Optional;

public interface IGenaralService<T> {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(T t);

    void remove(Long id);
}
