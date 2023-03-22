package com.dummy.testproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/webhook")
public class webhookController {
    @PostMapping // http://localhost:9000/api/webhook
    public ResponseEntity<String> print(@RequestBody String requestBody){
        System.out.println("webhook" + requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
}
