package com.cistudies.JavaSpringMaven.controller;

import com.cistudies.JavaSpringMaven.service.HelloWorldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    private HelloWorldService helloWorldService;

    public HelloWorld(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello-world")
    public ResponseEntity helloWorld(@RequestParam(value = "name") String name) {
        return ResponseEntity.ok(helloWorldService.helloWorldBuilder(name));
    }

}
