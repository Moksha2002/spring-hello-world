package com.moksha.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}