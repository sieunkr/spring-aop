package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(3000);
    }
}
