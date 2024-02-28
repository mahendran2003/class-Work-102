package com.page.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    private String city;
    private String roolno;
    public Student(int id, String name, int age, String city, String roolno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.roolno = roolno;
    }
    public Student() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRoolno() {
        return roolno;
    }
    public void setRoolno(String roolno) {
        this.roolno = roolno;
    }
    
    
}
