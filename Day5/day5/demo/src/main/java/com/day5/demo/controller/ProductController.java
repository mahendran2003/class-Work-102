package com.day5.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.demo.model.Product;
import com.day5.demo.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<Product> post(@RequestBody Product product)
    {
        Product p=productService.post(product);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    } 
    @PutMapping("api/product/{id}")
    public ResponseEntity<Product> putMethodName(@PathVariable int id, @RequestBody Product product) {
        if(productService.put(id, product))
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/api/product/{id}")
    public ResponseEntity<Product> deleteMethodName(@PathVariable int id) {
        if(productService.delete(id))
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}