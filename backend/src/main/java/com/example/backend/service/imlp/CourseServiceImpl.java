package com.example.backend.service.imlp;

import com.example.backend.dto.CourseDto;
import com.example.backend.entity.Course;
import com.example.backend.repository.CourseRepository;
import com.example.backend.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses;
    }
}
