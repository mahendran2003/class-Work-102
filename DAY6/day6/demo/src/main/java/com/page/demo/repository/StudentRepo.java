package com.page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.page.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>
{
    
}
