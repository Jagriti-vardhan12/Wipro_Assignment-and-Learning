package com.wipro.jv.quizmono.Service;

import java.util.List;

import com.wipro.jv.quizmono.entities.QuestionWrapper;
import com.wipro.jv.quizmono.entities.Quiz;
import com.wipro.jv.quizmono.entities.Response;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.DifficultyLevel;

public interface QuizService {
	
	Quiz createQuiz(Category category, DifficultyLevel difficultyLevel, String quizTitle);
	 
	List<QuestionWrapper> getQuizQuestions(Integer id);
 
	Integer	calculateResult(int id, List<Response> responses);

}
