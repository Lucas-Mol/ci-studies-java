package com.cistudies.JavaSpringMaven.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    void givenNameReturnHelloWorldName() {
        assertEquals("Hello World, Joe", helloWorldService.helloWorldBuilder("Joe"));
    }
}