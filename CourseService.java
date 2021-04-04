package com.springrest.springrest1.services;

import java.util.List;

import com.springrest.springrest1.entity.Course;

public interface CourseService {
 
	public List<Course> getCourses();
	 
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
  
}
