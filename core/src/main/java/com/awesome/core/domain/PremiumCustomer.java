package com.awesome.core.domain;

public final class PremiumCustomer extends Customer {

    public PremiumCustomer(Long id, String ssn, String name) {
        super(id, ssn, name);
    }

    @Override
    public String toString() {
        return "PremiumCustomer{" + "id=" + id + ", ssn='" + ssn + '\'' + ", name='" + name + '\'' + '}';
    }
}
