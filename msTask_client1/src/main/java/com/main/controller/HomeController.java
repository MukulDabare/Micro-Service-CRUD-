package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Student;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	@PostMapping ("/save")
	public String saveStudent(@RequestBody Student s)
	{
		String url="http://zuul/getcreate/saveStudent";
	    rt.postForObject(url, s, Student.class);
	    System.out.println("ConsumerName:- "+ s.getUsername());
		return "Student Saved";
		
	}
	
	@DeleteMapping ("/delete/{rollno}")
	public String deleteStudent(@PathVariable int rollno)
	{
		String url="http://zuul/getdelete/deleteStudent/"+rollno+"";
		rt.delete(url, String.class);
		return "Student Deleted";
	}
	
	@GetMapping ("/getStudent")
	public Iterable<Student> getStudent()
	{
		String url="http://zuul/getselect/getStudent";
		Iterable<Student> itr = rt.getForObject(url, Iterable.class);
		return itr;
	}
	
	@PutMapping ("/update")
	public String updateStudent(@RequestBody Student s)
	{
		String url= "http://zuul/getupdate/updateStudent";
		rt.put(url, s, Student.class);
		return "Student Updated";
	}

}
