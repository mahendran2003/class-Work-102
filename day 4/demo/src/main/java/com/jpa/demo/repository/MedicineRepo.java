package com.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Integer>
{
    
}
