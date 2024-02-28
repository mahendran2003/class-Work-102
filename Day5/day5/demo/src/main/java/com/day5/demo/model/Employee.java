package com.day5.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private Double salary;
    private int department;
    public Employee(int employeeId, String employeeName, String employeeEmail, Double salary, int department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.salary = salary;
        this.department = department;
    }
    public Employee() {
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public Double getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }
    
}