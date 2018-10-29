package com.awesome.api;

import com.awesome.core.Customer;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwesomeController {

    public Customer greetCustomer(@RequestParam(value = "name") String name) {
        return new Customer(1L, "199009091234", name);
    }
}
