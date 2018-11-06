package com.awesome.core.domain;

public final class StandardCustomer extends Customer {


    public StandardCustomer(Long id, String ssn, String name) {
        super(id, ssn, name);
    }

    @Override
    public String toString() {
        return "StandardCustomer{" + "id=" + id + ", ssn='" + ssn + '\'' + ", name='" + name + '\'' + '}';
    }
}
