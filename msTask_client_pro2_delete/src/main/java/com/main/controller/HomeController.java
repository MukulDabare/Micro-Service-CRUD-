package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.serviceI.HomeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	@DeleteMapping("/deleteStudent/{rollno}")
	public String saveStudent(@PathVariable int rollno)
	{
	    hs.deleteStudent(rollno);
		return "Student Deleted ";
		
	}

}
