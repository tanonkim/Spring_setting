package com.example.restfulwebservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (end-point)
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
