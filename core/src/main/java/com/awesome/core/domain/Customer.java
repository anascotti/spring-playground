package com.awesome.core.domain;


public class Customer {

    protected Customer(Long id, String ssn, String name) {
     this.id = id;
     this.ssn = ssn;
     this.name = name;
    }

    protected Long id;

    protected String ssn;

    protected String name;

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", ssn='" + ssn + '\'' + ", name='" + name + '\'' + '}';
    }

}
