package com.wipro.jv.studentmang.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String studentName;
	
	private String studentEmail;
	
	private Integer studentAge;
	
	private LocalDate studentDoB;
	
	private String studentAddress;


}
