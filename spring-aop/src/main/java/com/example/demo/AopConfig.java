package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfig {

    @Before("execution(* com.example.demo.HomeController.*(..))")
    public void doSomethingBefore() {

        System.out.println("AOP : Before ");
    }

    @After("execution(* com.example.demo.HomeController.*(..)) ")
    public void doSomethingAfter() {

        System.out.println("AOP : After");
    }
}
