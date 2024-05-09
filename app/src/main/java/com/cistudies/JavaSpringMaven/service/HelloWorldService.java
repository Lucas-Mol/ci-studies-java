package com.cistudies.JavaSpringMaven.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorldBuilder(String name) {
        return "Hello World, " + name;
    }
}
