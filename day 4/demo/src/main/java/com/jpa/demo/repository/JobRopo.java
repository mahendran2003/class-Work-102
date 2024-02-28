package com.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.model.Job;

public interface JobRopo extends JpaRepository<Job,Integer>
{
    
}
