package com.awesome.core.service;

import com.awesome.core.domain.StandardCustomer;
import org.springframework.stereotype.Service;

@Service
public class StandardFinder implements Finder<StandardCustomer> {

    @Override
    public StandardCustomer findCustomer(Long id) {
        return new StandardCustomer(id, "199009091234", "Miew");
    }
}
