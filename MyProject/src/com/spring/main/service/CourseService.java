package com.spring.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.model.Course;
import com.spring.main.persistence.CourseDB;


@Service
public class CourseService {
	@Autowired
	private CourseDB courseDB;
	public List<Course> fetchCourses(){
		
		return courseDB.fetchCourses();
	}
	
	

}
