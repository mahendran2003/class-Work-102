package com.jpa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.demo.model.Product;
import com.jpa.demo.repository.ProductRepo;

@Service
public class ProductService {
    public ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    };
    

    public Product save(Product product)
    {
        return productRepo.save(product);
    }


    public List<Product> getAll()
    {
        return productRepo.findAll();
    }

    public Product findId(int x)
    {
        return productRepo.findById(x).orElse(null);
    }


}
