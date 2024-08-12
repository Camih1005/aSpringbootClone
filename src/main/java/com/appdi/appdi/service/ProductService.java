package com.appdi.appdi.service;

import java.util.List;

import com.appdi.appdi.model.Product;

public interface ProductService {
Product findById(Long id);
List<Product> findAll();
}
