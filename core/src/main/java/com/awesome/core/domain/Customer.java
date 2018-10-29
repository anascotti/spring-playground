package com.awesome.core.domain;


public class Customer {

    public Customer(Long id, String ssn, String name) {
     this.id = id;
     this.ssn = ssn;
     this.name = name;
    }

    private Long id;

    private String ssn;

    private String name;

    public Long getId() {
        return id;
    }
    public String getSsn() { return ssn; }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", ssn='" + ssn + '\'' + ", name='" + name + '\'' + '}';
    }

}
