package com.page.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.page.demo.model.Student;
import com.page.demo.repository.StudentRepo;

@Service
public class StudentService {
    public StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    
    public Student post(Student student)
    {
        return studentRepo.save(student);
    }

    public List<Student> listing(int offset,int pagesize)
    {
        Page<Student> obj=studentRepo.findAll(PageRequest.of(offset, pagesize));
        return obj.getContent();
    }
    public List<Student> sorting(int offset,int pagesize,String field)
    {
        Page<Student> obj2=studentRepo.findAll(PageRequest.of(offset, pagesize,Sort.Direction.DESC, field));
        return obj2.getContent();
    }

}
