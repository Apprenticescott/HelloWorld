package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: xudp
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello,World";
    }
}
