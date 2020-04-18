package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @LogExecutionTime
    public String test() throws InterruptedException {

        Thread.sleep(3000);

        return "test";
    }
}
