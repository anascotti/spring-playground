package com.awesome.customer;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

    public Customer findById(Long id);

}
