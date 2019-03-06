package com.tk.demo.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ObjectAspectConfig {
    @Pointcut("target(com.tk.demo.service.ProductService)")
   public void mactCondition(){}
   @Before("mactCondition()")
   public void before(){
       System.out.println("####before***************");
   }
}
