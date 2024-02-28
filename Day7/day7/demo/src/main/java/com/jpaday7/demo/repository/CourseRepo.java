package com.jpaday7.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaday7.demo.model.Course;
import java.util.List;


@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>
{
    List<Course> findByCourseName(String courseName);
}
