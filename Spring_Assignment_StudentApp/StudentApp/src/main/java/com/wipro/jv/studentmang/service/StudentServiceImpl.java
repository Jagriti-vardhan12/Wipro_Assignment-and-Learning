package com.wipro.jv.studentmang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.jv.studentmang.entities.Student;
import com.wipro.jv.studentmang.repo.StudentRepo;



@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAll() {
		
		return studentRepo.findAll();
		
	}

	@Override
	public void save(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public Student getById(Integer id) {
		
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		studentRepo.deleteById(id);
		
	}

	
}
