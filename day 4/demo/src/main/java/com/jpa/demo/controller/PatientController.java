package com.jpa.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Patient;
import com.jpa.demo.service.PatientService;

@RestController
public class PatientController {
    public PatientService patientService;
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    
    @PostMapping("/api/student")
    public ResponseEntity<Patient> post(@RequestBody Patient patient)
    {
        Patient obj= patientService.posting(patient);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/patient")
    public ResponseEntity<List<Patient>> all()
    {
        List<Patient> obj2=patientService.all();
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }
    @GetMapping("/api/patient/{patientId}")
    public ResponseEntity<Patient> particular(@PathVariable int patientId)
    {
        Patient obj3=patientService.findbyId(patientId);
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }
}
