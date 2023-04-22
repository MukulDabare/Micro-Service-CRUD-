package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceI.HomeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	@PostMapping ("/saveStudent")
	public Student saveStudent(@RequestBody Student s)
	{
	    
		hs.saveStudent(s);
		return s;
		
	}

}
