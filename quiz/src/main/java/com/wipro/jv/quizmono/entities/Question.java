package com.wipro.jv.quizmono.entities;

import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.Difficulty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long QuestionID;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correctAnswer;
	private Category category;
	private Difficulty difficultyLevel;
	public Object getQuestionID() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getOption1() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getQuestionTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getOption2() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getOption3() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getOption4() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getQuestionID1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCorrectAnswer1() {
		// TODO Auto-generated method stub
		return null;
	}
}

	