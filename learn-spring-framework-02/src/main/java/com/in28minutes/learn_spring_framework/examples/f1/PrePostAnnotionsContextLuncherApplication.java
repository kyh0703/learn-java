package com.in28minutes.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("Constructor Injection");
    }

    @PostConstruct
    public void init() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("SomeDependency is ready");
    }
}


@Configuration
@ComponentScan
public class PrePostAnnotionsContextLuncherApplication {

    public static void main(String[] args) {
        try (
            var context = new AnnotationConfigApplicationContext(
                PrePostAnnotionsContextLuncherApplication.class)

        ) {
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        }
    }

}
