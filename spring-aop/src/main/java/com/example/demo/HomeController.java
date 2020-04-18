package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {


    @GetMapping("/test")
    public String test() {

        System.out.println("homeController..");
        return "ok";
    }


}
