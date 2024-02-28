package com.jpa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    private int jobId;
    private String jobTitle;
    private int minSalary;
    private String jobDescription;
    private int maxSalary;
    public Job(int jobId, String jobTitle, int minSalary, String jobDescription, int maxSalary) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.jobDescription = jobDescription;
        this.maxSalary = maxSalary;
    }
    public Job() {
    }
    public int getJobId() {
        return jobId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public int getMinSalary() {
        return minSalary;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public int getMaxSalary() {
        return maxSalary;
    }
}
