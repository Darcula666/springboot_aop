package com.tk.demo.service;

import com.tk.demo.domain.Product;
import com.tk.demo.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    AuthService authService;

    @AdminOnly
    public void insert(Product product){
        System.out.println("insert product");
    }
    @AdminOnly
    public void delete(Long id){
        System.out.println("delete product");
    }
}
