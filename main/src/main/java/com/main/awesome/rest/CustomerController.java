package com.main.awesome.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.core.awesome.customer.Customer;
import com.core.awesome.customer.CustomerService;
import com.main.awesome.rest.domain.CustomerDto;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    private ModelMapper modelMapper;
    private CustomerService service;

    @Autowired
    public CustomerController(ModelMapper modelMapper, CustomerService service) {
        this.modelMapper = modelMapper;
        this.service = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, 
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") Long id) {
        return service.findById(id).map(this::toDto)
                .map(dto -> ResponseEntity.ok(dto))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Void> addCustomer(@RequestBody CustomerDto customer) {
        service.add(toEntity(customer));
        return ResponseEntity.ok().build();
    }

    private CustomerDto toDto(Customer customer) {
        return modelMapper.map(customer, CustomerDto.class);
    }

    private Customer toEntity(CustomerDto customerDto) {
        return modelMapper.map(customerDto, Customer.class);
    }

}
