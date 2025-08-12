package com.wipro.jv.studentmang.service;

import java.util.List;

import com.wipro.jv.studentmang.entities.Student;



public interface StudentService {
	
	public List<Student> getAll();

	public void save(Student student);

	public Student getById(Integer id);

	public void delete(Integer id);


}
