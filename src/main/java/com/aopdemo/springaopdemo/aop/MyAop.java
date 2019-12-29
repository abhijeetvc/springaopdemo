package com.aopdemo.springaopdemo.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {

//    @Pointcut(" execution (* com.aopdemo.springaopdemo.impl.MyImpl.doSomething(..))")
//    public void checkAop(){
//
//    }

    @Before(" execution (* com.aopdemo.springaopdemo.impl.MyImpl.doSomething(..))")
    public void actualAdvice(){
        System.out.println("Heeeellllllooooooooooooo");
    }
}
