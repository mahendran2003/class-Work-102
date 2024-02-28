package com.day5.demo.service;

import org.springframework.stereotype.Service;

import com.day5.demo.model.Employee;
import com.day5.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public Employee post(Employee employee)
    {
        return employeeRepo.save(employee);
    }
    public Employee getById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
    public boolean put(int id,Employee employee)
    {
        if(getById(id)==null)
        {
            return true;
        }
        employeeRepo.save(employee);
        return true;
    }
    public boolean delete(int id)
    {
        if(getById(id)==null)
        {
            return true;
        }
        employeeRepo.deleteById(id);
        return true;
    }
}