package com.luve.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luve.sms.service.StudentsService;

@Controller
public class MyController {
	
	private StudentsService service;

	public MyController(StudentsService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public String getStuds(Model model) {
		model.addAttribute("students", service.getStudents());
		return "students";
	}

}
