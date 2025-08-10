package com.wipro.jv.quizmono.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Title;

	@ManyToMany
	private List<Question> questions;

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}

	public void setQuestions(List<Question> questions2) {
		// TODO Auto-generated method stub
		
	}

	public List<Question> getQuestions1() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
