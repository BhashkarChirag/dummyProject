package com.dummy.testproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/test") // http://localhost:9000/test
    public String test()
    {
        System.out.println("Inside about handler ....");
        return "test";
    }
}
