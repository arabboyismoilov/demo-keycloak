package com.example.demokeycloak.service;

import com.example.demokeycloak.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long id);
}
