package com.main.serviceI;

import com.main.model.Student;

public interface HomeServiceI {
	
	
	public void saveStudent(Student s);

	public void deleteStudent(int rollno);
	
	public Iterable<Student> getStudent();

}
