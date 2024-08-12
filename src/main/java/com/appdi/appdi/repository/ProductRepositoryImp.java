package com.appdi.appdi.repository;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.appdi.appdi.model.Product;

@Repository
public class ProductRepositoryImp implements ProductRepository {
    List<Product> product;

    public ProductRepositoryImp() {
    
        this.product = Arrays.asList(
                new Product(1L, "Laptop", 560L),
                new Product(2L, "Smatphone", 350L),
                new Product(3L, "Tablet", 230L),
                new Product(4L, "Monitor", 550L),
                new Product(5L, "Keyboard", 650L),
                new Product(6L, "Mouse", 450L),
                new Product(7L, "Printer", 440L),
                new Product(8L, "External Hard Drive", 456L),
                new Product(9L, "Headphones", 150L),
                new Product(10L, "Webcam", 550L));

    }

    @Override
    public Product findById(Long id) {
        return this.product.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public List<Product> findAll() {
      return product;
    }

}
