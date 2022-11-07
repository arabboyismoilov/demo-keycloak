package com.example.demokeycloak.service.impl;

import com.example.demokeycloak.entity.Course;
import com.example.demokeycloak.repository.CourseRepository;
import com.example.demokeycloak.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

}
