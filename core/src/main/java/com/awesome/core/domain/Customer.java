package com.awesome.core.domain;


public class Customer {

    protected Customer(Long id, String ssn, String name) {
     this.id = id;
     this.ssn = ssn;
     this.name = name;
    }

    public final Long id;

    public final String ssn;

    public final String name;


    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", ssn='" + ssn + '\'' + ", name='" + name + '\'' + '}';
    }

}
