package com.jpa.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Product;
import com.jpa.demo.service.ProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {
    public ProductService productService;

    @PostMapping("/api/product")
    public ResponseEntity <Product> save(@RequestBody Product product)
    {
        Product obj=productService.save(product);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<Product>> find()
    {
        List<Product> li=productService.getAll();
        return new ResponseEntity<>(li,HttpStatus.OK);
    }

    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Product>jj(@PathVariable int id)
    {
        Product object=productService.findId(id);
        return new ResponseEntity<>(object,HttpStatus.OK);
    }
}
