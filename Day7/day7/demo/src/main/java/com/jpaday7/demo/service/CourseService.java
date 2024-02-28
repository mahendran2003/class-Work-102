package com.jpaday7.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpaday7.demo.model.Course;
import com.jpaday7.demo.repository.CourseRepo;

@Service
public class CourseService {
    public CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course posting(Course course)
    {
        return courseRepo.save(course);
    }

    public List<Course> getall()
    {
        return courseRepo.findAll();
    }
    
    public List<Course> fidning(String courseName)
    {
        return courseRepo.findByCourseName(courseName);
    }
}
