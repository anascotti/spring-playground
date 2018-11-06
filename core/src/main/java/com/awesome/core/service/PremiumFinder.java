package com.awesome.core.service;

import com.awesome.core.domain.PremiumCustomer;

public class PremiumFinder implements Finder<PremiumCustomer> {
    @Override
    public PremiumCustomer findCustomer(Long id) {
        return new PremiumCustomer(1L, "199009091234", "Miew");
    }
}
