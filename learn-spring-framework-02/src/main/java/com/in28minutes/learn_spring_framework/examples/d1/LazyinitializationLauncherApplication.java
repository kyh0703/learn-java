package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("ClassB constructor called");
        this.classA = classA;
    }

    public void DoSomething() {
        System.out.println("Doing something");
    }
}


@Configuration
@ComponentScan
public class LazyinitializationLauncherApplication {

    public static void main(String[] args) {
        try (
            var context = new AnnotationConfigApplicationContext(
                LazyinitializationLauncherApplication .class)

        ) {
            System.out.println("INit" );
            context.getBean(ClassB.class).DoSomething();
        }
    }

}
