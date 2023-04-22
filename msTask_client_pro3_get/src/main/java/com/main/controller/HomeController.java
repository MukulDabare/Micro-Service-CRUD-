package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceI.HomeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	@GetMapping ("/getStudent")
	public Iterable<Student> getStudent()
	{
		Iterable<Student> list = hs.getStudent();
		return list;
	}

}
