package com.aopdemo.springaopdemo.impl;

import com.aopdemo.springaopdemo.repos.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {

    @Override
    public void doSomething() {
        System.out.println("Hiiiiiiiiiiiiiiiiii");
        //return nul;
    }
}
