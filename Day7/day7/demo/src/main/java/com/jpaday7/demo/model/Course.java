package com.jpaday7.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private int courseId;
    private String courseName;
    private int creditHours;
    private String instructor;
    private String preRequisites;
    private int maxCapacity;
    private String eneolledStudents;
    public Course(int courseId, String courseName, int creditHours, String instructor, String preRequisites,
            int maxCapacity, String eneolledStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructor = instructor;
        this.preRequisites = preRequisites;
        this.maxCapacity = maxCapacity;
        this.eneolledStudents = eneolledStudents;
    }
    
    public Course() {
    }

    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getPreRequisites() {
        return preRequisites;
    }
    public void setPreRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public String getEneolledStudents() {
        return eneolledStudents;
    }
    public void setEneolledStudents(String eneolledStudents) {
        this.eneolledStudents = eneolledStudents;
    }
    
}
