package com.jpa.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Medicine;
import com.jpa.demo.service.MedicineService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MedicalController {
    public MedicineService medicineService;

    public MedicalController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping("/api/medicine")
    public ResponseEntity<Medicine> john(@RequestBody Medicine medicine)
    {
        Medicine obj=medicineService.saveDetails(medicine);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    } 

    @GetMapping("/api/medicines")
    public ResponseEntity<List<Medicine>> jj()
    {
        List<Medicine> li= medicineService.getAll();
        return new ResponseEntity<>(li,HttpStatus.OK);
    }

    @GetMapping("/api/medicine{id}")
    public ResponseEntity<Medicine> kk(@PathVariable int id)
    {
        Medicine obj2=medicineService.findId(id);
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }
}
