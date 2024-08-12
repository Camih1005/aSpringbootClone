package com.appdi.appdi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdi.appdi.model.Product;
import com.appdi.appdi.service.ProductService;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("")
    public List<Product> find() {
        return productService.findAll();
    }

    
}
