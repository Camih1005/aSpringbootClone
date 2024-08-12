package com.appdi.appdi.repository;

import java.util.List;

import com.appdi.appdi.model.Product;

public interface ProductRepository {

    Product findById(Long id);
    List<Product> findAll();
}
