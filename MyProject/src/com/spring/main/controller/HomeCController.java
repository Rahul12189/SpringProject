package com.spring.main.controller;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servelet.ModelAndView;


@Controller//<-- Tells spring that this is controller class

public class HomeCController {

	/*
	 * Model interface is injected in Home Method
	 * 
	 * */
	
	@RequestMapping("/")
	public  String showHome(Model model) {
		model.addAttribute("name","Rahul Kadam");		
		return "home";
		
	}
	
}
