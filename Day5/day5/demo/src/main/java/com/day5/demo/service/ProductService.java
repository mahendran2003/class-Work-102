package com.day5.demo.service;

import org.springframework.stereotype.Service;

import com.day5.demo.model.Product;
import com.day5.demo.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }






    public Product post(Product product)
    {
        return productRepo.save(product);
    }




    public Product getById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }

    
    public boolean put(int id,Product product)
    {
        if(getById(id)==null)
        {
            return true;
        }
        productRepo.save(product);
        return true;
    }
    public boolean delete(int id)
    {
        if(getById(id)==null)
        {
            return true;
        }
        productRepo.deleteById(id);
        return true;
    }
}