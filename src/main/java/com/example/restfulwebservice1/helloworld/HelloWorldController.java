package com.example.restfulwebservice1.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (end-point)
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {     // HelloWorldBean : 반환값
        return new HelloWorldBean("Hello World"); // option + Enter : 해결단축키
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {     // HelloWorldBean : 반환값
        return new HelloWorldBean(String.format("Hello World, %s", name)); // option + Enter : 해결단축키
    }
}
