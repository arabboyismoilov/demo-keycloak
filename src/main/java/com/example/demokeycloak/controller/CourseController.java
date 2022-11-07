package com.example.demokeycloak.controller;

import com.example.demokeycloak.entity.Course;
import com.example.demokeycloak.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    @RolesAllowed("admin")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("{courseId}")
    @RolesAllowed("user")
    public Course getCourse(@PathVariable Long courseId){
        return courseService.getCourseById(courseId);
    }
}
