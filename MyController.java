package com.springrest.springrest1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest1.entity.Course;
import com.springrest.springrest1.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
    @GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
    	return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
    	return this.courseService.addCourse(course);
    }
      
}
