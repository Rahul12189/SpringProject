package com.spring.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.main.model.Course;
import com.spring.main.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public String showCourses(Model model) {
		
		List<Course> list = courseService.fetchCourses();
		model.addAttribute("list", list);
		return "courses";
	}

}
