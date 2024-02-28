package com.jpa.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.jpa.demo.model.Medicine;
import com.jpa.demo.repository.MedicineRepo;

@Service
public class MedicineService {
    public MedicineRepo medicineRepo;

    public MedicineService(MedicineRepo medicineRepo) {
        this.medicineRepo = medicineRepo;
    }
    public Medicine saveDetails(Medicine medicine)
    {
        return medicineRepo.save(medicine);
    }
    public List<Medicine> getAll()
    {
        return medicineRepo.findAll();
    }
    public Medicine findId(int a)
    {
        return medicineRepo.findById(a).orElse(null);
    }
}
 