package com.day5.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.demo.model.Employee;
import com.day5.demo.service.EmployeeService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<Employee> post(@RequestBody Employee employee)
    {
        Employee p=employeeService.post(employee);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    } 
    @PutMapping("api/employee/{id}")
    public ResponseEntity<Employee> putMethodName(@PathVariable int id, @RequestBody Employee employee) {
        if(employeeService.put(id, employee))
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/api/employee/{id}")
    public ResponseEntity<Employee> deleteMethodName(@PathVariable int id) {
        if(employeeService.delete(id))
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}