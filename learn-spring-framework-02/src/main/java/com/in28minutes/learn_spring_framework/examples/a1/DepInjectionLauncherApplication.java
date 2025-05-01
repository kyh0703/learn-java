package com.in28minutes.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
    Dependency1 dependency1;

    Dependency2 dependency2;

    // Constructor Injection :생성자는 AutoWired 필수가 아님
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    // Setter Injection
    // @Autowired
    // public void setDependency1(Dependency1 dependency1) {
    //     this.dependency1 = dependency1;
    // }

    // @Autowired
    // public void setDependency2(Dependency2 dependency2) {
    //     this.dependency2 = dependency2;
    // }


    public String toString() {
        return "dependency1: " + dependency1 + ", dependency2: " + dependency2;
    }
}


@Component
class Dependency1 {

}

@Component
class Dependency2 {

}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        try (
            var context = new AnnotationConfigApplicationContext(
                DepInjectionLauncherApplication.class)

        ) {
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class).toString());
        }
    }

}
