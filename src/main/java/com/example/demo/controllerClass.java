package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class controllerClass {

    @PostMapping("/api/v1")
    public String getVals(@Valid @RequestBody RequestParams requestParams) {
        System.out.println( requestParams.getA());
        System.out.println( requestParams.getB());
        System.out.println( requestParams.getC());
        return "test";
    }

}