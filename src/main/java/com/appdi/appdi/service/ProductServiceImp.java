package com.appdi.appdi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdi.appdi.model.Product;
import com.appdi.appdi.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

@Autowired
private ProductRepository productRepository;



    public Product findById(Long id) {
        return productRepository.findById(id);
    }

  public List<Product> findAll(){
return productRepository.findAll().stream().map(p ->{
Double priceImp = p.getPrice() * 1.45d;
Product newProduct = new Product(p.getId(), p.getName(),

priceImp.longValue());

// p.setPrice(priceImp.longValue());
return newProduct;
}).collect(Collectors.toList());
}

    // @Override
    // public List<Product> findAll() {
    //   return productRepository.findAll();
    // }
    

}
