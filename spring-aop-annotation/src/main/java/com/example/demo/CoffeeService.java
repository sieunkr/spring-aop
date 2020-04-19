package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @LogExecutionTime
    public void test_a() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @CustomAnnotation
    public void test_b(String name) {

        System.out.println("My name is " + name);
    }
}
