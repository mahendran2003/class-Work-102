package com.jpa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StuDetails {
    public StuDetails() {
    }
    @Id
    private int rollNumber;
    private String name;
    private String email;
    public StuDetails(int rollNumber, String name, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
