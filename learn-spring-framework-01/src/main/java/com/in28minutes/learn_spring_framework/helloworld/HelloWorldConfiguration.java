package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) { }

// Address - firstLine & city
record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }


    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameter(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qulifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name="address2")
    @Primary
    public Address address() {
        return new Address("Baker", "londnon");
    }

    @Bean(name="address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Motinagar", "London");
    }
}
