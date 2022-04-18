package com.example.controller;

import java.util.List;

import com.example.models.Course;
import com.example.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CoursesController {

  private final CourseRepository courseRepository;



  @GetMapping
  public List<Course> list(){
    return courseRepository.findAll();
  }
}
