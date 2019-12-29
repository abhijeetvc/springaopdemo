package com.aopdemo.springaopdemo.controller;


import com.aopdemo.springaopdemo.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyImpl myImpl;

    @GetMapping(value="/checkaop")
    public String getData(){
        myImpl.doSomething();
        return "Hello AOP";
    }
}
