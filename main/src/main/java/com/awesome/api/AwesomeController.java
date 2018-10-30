package com.awesome.api;

import com.awesome.core.domain.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class AwesomeController {

    @RequestMapping("/greeting")
    public Customer greeting(@RequestParam(value = "name", defaultValue = "Miew") String name) {
        return new Customer(1L, "199009091234", name);
    }

    @RequestMapping("/customers")
    public List<Customer> customers() {
        var list = new ArrayList<Customer>();
        list.add(new Customer(1L, "199009091234", "Miew"));
        list.add(new Customer(2L, "199009094321", "Woof"));
        return list;
    }
}
