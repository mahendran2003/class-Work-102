package com.jpa.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>
{
    
}
