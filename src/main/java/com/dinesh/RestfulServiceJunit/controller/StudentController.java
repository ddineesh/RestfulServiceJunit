package com.dinesh.RestfulServiceJunit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.RestfulServiceJunit.model.Course;
import com.dinesh.RestfulServiceJunit.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/application")
	public String applicationName()
	{
		return "Hello World this is RestfulServiceJunit!!!!";
	}

	@GetMapping("/students/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId)
	{
		return studentService.retrieveCourses(studentId);
	}
	
	@GetMapping("/students/{studentId}/courses/{courseId}")
	public Course retrieveDetailsOfCourse(@PathVariable String studentId, @PathVariable String courseId)
	{
		return studentService.retrieveCourse(studentId,courseId);
	}
	
}
