package com.example.demo17.controllers;

import com.example.demo17.models.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Demo17Controller {
    @GetMapping("/hello")
    public Message getHello() {
        Message msg = new Message("Hello from model");
        return msg;
    }
}
