package com.jpa.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Job;
import com.jpa.demo.service.JobService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class JobController {
    public JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    
    @PostMapping("/api/job")   
    public ResponseEntity<Job> saveDetails(@RequestBody Job job)
    {
        Job obj=jobService.kings(job);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/job")
    public ResponseEntity<List<Job>>findall()
    {
        List<Job> all=jobService.john();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }

    @GetMapping("/api/job/{jobId}")
    public ResponseEntity<Job> findId(@PathVariable int x)
    {
        Job obj2=jobService.findId(x);
        return  new ResponseEntity<>(obj2,HttpStatus.OK);
    }

    
    
}
