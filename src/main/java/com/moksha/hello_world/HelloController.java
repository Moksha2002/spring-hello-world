package com.moksha.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello , World";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Moksha") String name) {
        return "Hello, " + name + "!"; 
    }

    //new endpoint
    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return List.of(
            new Expense(1, "Groceries", 50.75),
            new Expense(2, "Transport", 15.00),
            new Expense(3, "Netflix Subscription", 9.99)
        );
    }
}