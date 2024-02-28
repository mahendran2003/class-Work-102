package com.jpa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.jpa.demo.model.Patient;
import com.jpa.demo.repository.PatientRepo;

@Service
public class PatientService {
    public PatientRepo patientRepo;

    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    
    //----------------------------


    public Patient posting(Patient patient)
    {
        return patientRepo.save(patient);
    }
    public List<Patient> all()
    {
        return patientRepo.findAll();
    }
    public Patient findbyId(int x)
    {
        return patientRepo.findById(x).orElse(null);
    }
}
