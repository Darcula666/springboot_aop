package com.tk.demo.service;

import com.tk.demo.security.CurrentUserHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthService {
    public  void checkAccess(){
        String user= CurrentUserHolder.get();
        if (!"admin".equals(user)){
            throw new RuntimeException("operation not allow");
        }
    }
}
