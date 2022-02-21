package com.learning.azure.controller;

import com.learning.azure.controller.model.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorld helloWorldBean() {
        return new HelloWorld("Hello World");
    }

    @GetMapping("/hello-world/path-variable/{guestName}")
    public HelloWorld helloWorldBean(@PathVariable String guestName) {
        return new HelloWorld("Hello World, " + guestName);
    }
}
