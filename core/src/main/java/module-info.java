module com.awesome.core {
    requires java.base;
    requires spring.context;
    exports com.awesome.core.domain;
    exports com.awesome.core.service;
}