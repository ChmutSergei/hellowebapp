package com.simple.hellowebapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DummyController {

    @GetMapping(path="/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(@PathVariable String name) {
        return "Hello " + name + " -> ok!";
    }
}

