package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class HomeController {

    private final CoffeeService service;

    public HomeController(CoffeeService service) {
        this.service = service;
    }

    @GetMapping("/a")
    public String test_a() {

        service.test_a();

        return "a";

    }

    @GetMapping("/b")
    public String test_b(@RequestParam(name = "name") String name) {

        service.test_b(name);

        return "b";

    }


}
