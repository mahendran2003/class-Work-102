package com.day5.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private String productDescription;
    public Product(int productId, String productName, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
    }
    public Product() {
    }
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
}