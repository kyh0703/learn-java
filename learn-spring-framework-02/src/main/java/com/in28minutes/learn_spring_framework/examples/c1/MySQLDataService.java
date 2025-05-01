package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Repository;

// @Component
@Repository
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        System.out.println("MySQLDataService");
        return new int[] { 1, 2, 3, 4, 5 };
    }
}
