/* This causes split packages issue
 * This only works when building with maven which places transitive dependencies in the classpath.
 * Intellij places them in the module path resulting in 'reads from both' errors.
 * */
module com.awesome {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires com.awesome.core;
}