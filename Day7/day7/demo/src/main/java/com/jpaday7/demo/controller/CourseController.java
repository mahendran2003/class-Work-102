package com.jpaday7.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.jpaday7.demo.model.Course;
import com.jpaday7.demo.service.CourseService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class CourseController {
    public CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    
    @PostMapping("/api/course")
    public ResponseEntity<Course> posting(@RequestBody Course course)
    {
        Course obj=courseService.posting(course);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/course")
    public ResponseEntity<List<Course>> geting()
    {
        List<Course> obj2=courseService.getall();
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }
    
    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<Course>> findby(@PathVariable String courseName)
    {
        List<Course> obj3=courseService.fidning(courseName);
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }
    
}
