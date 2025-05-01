package com.in28minutes.learn_spring_framework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlConfigurationContextLuncherApplication {

    public static void main(String[] args) {
        try (
            var context = new ClassPathXmlApplicationContext(
                "contextConfiguration.xml")

        ) {
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

                System.out.println(context.getBean("name"));
                System.out.println(context.getBean("age"));
        }
    }

}
