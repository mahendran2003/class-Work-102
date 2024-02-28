package com.jpa.demo.service;
import org.springframework.stereotype.Service;
import com.jpa.demo.model.StuDetails;
import com.jpa.demo.repository.StuRepositary;

@Service
public class StuService {

    private StuRepositary stuRepositary;
    public StuService (StuRepositary stuRepositary)
    {
        this.stuRepositary=stuRepositary;
    }


    public StuDetails saveStudent(StuDetails stuDetails)
    {
        //do it in the repositary
        return stuRepositary.save(stuDetails);
    }
}
