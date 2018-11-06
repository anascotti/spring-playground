package com.awesome.api;

import com.awesome.core.domain.Customer;
import com.awesome.core.domain.StandardCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.awesome.core.service.Finder;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AwesomeController {

    private Finder<StandardCustomer> finder;

    public AwesomeController(@Autowired Finder finder) {
        this.finder = finder;
    }

    @RequestMapping("/greeting")
    public Customer greeting(@RequestParam(value = "name", defaultValue = "Miew") String name) {
        return new StandardCustomer(1L, "199009091234", name);
    }

    @RequestMapping("/customers/{id}")
    public List<Customer> customers(@PathVariable Long id) {
        var list = new ArrayList<Customer>();
        list.add(finder.findCustomer(id));
        return list;
    }
}
