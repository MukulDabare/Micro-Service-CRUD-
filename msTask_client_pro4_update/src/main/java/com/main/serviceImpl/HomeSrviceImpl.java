package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repositoryI.HomeRepository;
import com.main.serviceI.HomeServiceI;

@Service
public class HomeSrviceImpl implements HomeServiceI {
	@Autowired
	HomeRepository hr;
	
	public void saveStudent(Student s)
	{
		hr.save(s);
	}

	@Override
	public void deleteStudent(int rollno) {
		hr.deleteById(rollno);
		
	}

	@Override
	public Iterable<Student> getStudent() {
		Iterable<Student> all = hr.findAll();
		return all;
		
	}

	
	

}
