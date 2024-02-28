package com.jpa.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.StuDetails;
import com.jpa.demo.service.StuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StuController {    
    private StuService stuService;

    public StuController(StuService stuService)
    {
        this.stuService=stuService;
    }

    @PostMapping("/student")    
    public StuDetails postStudent(@RequestBody StuDetails stuDetails)
    {
        //call the service bean for saving
        stuService.saveStudent(stuDetails);
        return stuDetails;
    }
}
