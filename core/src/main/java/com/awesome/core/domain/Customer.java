package com.awesome.core.domain;


public class Customer {

    protected Customer(Long id, String ssn, String name) {
     this(id, ssn, name, Category.X);
    }

    protected Customer(Long id, String ssn, String name, Category category) {
        this.id = id;
        this.ssn = ssn;
        this.name = name;
        this.category = category;
    }

    public final Long id;

    public final String ssn;

    public final String name;

    public final Category category;


    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", ssn='" + ssn + '\'' + ", name='" + name + '\'' + '}';
    }

    public enum Category {
        A, B, C, D, E, X;
    }

    public int discountRate(){
        return switch (category) {
            case X, E -> 0;
            case D, C -> 5;
            case B -> 10;
            case A -> 15;
        };
    }

}
