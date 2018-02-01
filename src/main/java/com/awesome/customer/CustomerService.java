package com.awesome.customer;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer add(Customer customer) {
        Customer addedCustomer = customerRepository.save(customer);
        LOGGER.debug("Added new customer={}", addedCustomer);
        return addedCustomer;
    }

    public Optional<Customer> findById(Long id) {
        return Optional.ofNullable(customerRepository.findById(id));
    }
}
