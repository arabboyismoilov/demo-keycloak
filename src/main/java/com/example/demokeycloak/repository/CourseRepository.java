package com.example.demokeycloak.repository;

import com.example.demokeycloak.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
