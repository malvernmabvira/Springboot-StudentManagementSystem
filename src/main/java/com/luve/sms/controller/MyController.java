package com.luve.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.luve.sms.model.Students;
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
	
	@GetMapping("/students/new")
	public String createStud(Model model) {
		
		Students stud = new Students();
		model.addAttribute("student", stud);
		return "create";
	}
	
	@PostMapping("/students")
	public String addStudent(@ModelAttribute("student") Students stud) {
		service.addStud(stud);
		return "redirect:/students";
	}

}
