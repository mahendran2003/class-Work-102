package com.jpa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    private int medicineId;
    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufracturedIn;
    private Double medicinePrice;
    private String expiryDate;
    public Medicine(int medicineId, String medicineName, String medicineFor, String medicineBrand,
            String manufracturedIn, Double medicinePrice, String expiryDate) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.medicineFor = medicineFor;
        this.medicineBrand = medicineBrand;
        this.manufracturedIn = manufracturedIn;
        this.medicinePrice = medicinePrice;
        this.expiryDate = expiryDate;
    }
    public Medicine() {
    }
    public int getMedicineId() {
        return medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public String getManufracturedIn() {
        return manufracturedIn;
    }
    public Double getMedicinePrice() {
        return medicinePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    
}
