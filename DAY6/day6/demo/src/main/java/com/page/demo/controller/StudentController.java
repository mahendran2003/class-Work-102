package com.page.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.page.demo.model.Student;
import com.page.demo.service.StudentService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class StudentController {
    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    

    @PostMapping("/api/student")
    public ResponseEntity<Student> posting(@RequestBody Student student)
    {
        Student obj=studentService.post(student);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }
    
    @GetMapping("/api/student")
    public ResponseEntity<List<Student>> getting(@RequestParam int offset,@RequestParam int pagesize)
    {
        List<Student> obj2=studentService.listing(offset, pagesize);
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }

    @GetMapping("/api/student/sort")
    public ResponseEntity<List<Student>> sorting(@RequestBody int offset,@RequestBody int pagesize,@RequestBody String field)
    {
        List<Student> obj3=studentService.sorting(offset, pagesize, field);
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }
}
