package com.jpa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.jpa.demo.model.Job;
import com.jpa.demo.repository.JobRopo;

@Service
public class JobService {
    public JobRopo jobRopo;

    public JobService(JobRopo jobRopo) {
        this.jobRopo = jobRopo;
    }
    
    public Job kings(Job job)
    {
        return jobRopo.save(job);
    }
    public List<Job> john()
    {
        return jobRopo.findAll();
    }
    public Job findId(int x)
    {
        return jobRopo.findById(x).orElse(null);
    }
}
