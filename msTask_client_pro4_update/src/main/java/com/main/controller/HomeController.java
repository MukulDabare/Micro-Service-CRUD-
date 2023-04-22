package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceI.HomeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	@PutMapping ("/updateStudent")
	public String updateStudent(@RequestBody Student s)
	{
		hs.saveStudent(s);
		return "Student Updated";
	}
}
