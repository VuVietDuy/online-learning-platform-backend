package com.example.backend.service;

import com.example.backend.dto.CourseDto;
import com.example.backend.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();
}
