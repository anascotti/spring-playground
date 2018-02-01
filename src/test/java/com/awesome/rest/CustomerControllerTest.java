package com.awesome.rest;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.awesome.customer.Customer;
import com.awesome.customer.CustomerService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = CustomerController.class)
public class CustomerControllerTest {

    private static final String CUSTOMERS_API_URL = "/customers";

    @Autowired
    private MockMvc mockMvc;

    @SpyBean
    private ModelMapper modelMapper;

    @MockBean
    private CustomerService service;

    @Test
    public void shouldGetCustomer() throws Exception {
        Long id = 123L;
        doReturn(Optional.of(mock(Customer.class))).when(service).findById(id);

        mockMvc.perform(get(CUSTOMERS_API_URL + "/" + id)).andExpect(status().isOk());

    }
}
