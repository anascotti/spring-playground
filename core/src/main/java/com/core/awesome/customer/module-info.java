module awesome.core {

    requires slf4j.api;
    requires spring.beans;
    requires spring.data.jpa;
    requires spring.context;
    requires joda.time;
    requires java.persistence;

    exports com.core.awesome.customer;
}