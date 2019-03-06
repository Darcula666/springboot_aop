package com.tk.demo.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArgsAspectConfig {
    @Pointcut("args(Long) && within(com.tk.demo.service.*)")
    public void matchArgs(){

    }
    @Before("matchArgs()")
    public  void before(){
        System.out.println("$$$$before$$$$$");
    }
}
