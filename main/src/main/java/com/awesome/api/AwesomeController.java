package com.awesome.api;

import com.awesome.core.domain.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwesomeController {

    @RequestMapping("/greeting")
    public Customer greeting(@RequestParam(value = "name", defaultValue = "Miew") String name) {
        return new Customer(1L, "199009091234", name);
    }
}
