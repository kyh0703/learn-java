package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

// @Component
@Repository
@Primary
public class MongoDbDataService  implements DataService {
    @Override
    public int[] retrieveData() {
        System.out.println("MongoDbDataService");
        return new int[] { 11, 2, 3, 4, 5 };
    }
}
