package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloworldSpring {
    public static void main(String[] args) {
        // Launch a Sptring COntext
        var context =  new AnnotationConfigApplicationContext (HelloWorldConfiguration.class);

        // Configure the things that we want to manage - @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person5Qulifier"));
        //  System.out.Println
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
