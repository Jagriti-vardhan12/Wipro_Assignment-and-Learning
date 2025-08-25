package com.wipro.jv.quizmono.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.jv.quizmono.entities.Question;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.DifficultyLevel;

public interface QuestionService {
	
	Question save(Question question);
	 
	List<Question> findByCategoryAndDifficultyLevel(Category category, DifficultyLevel difficultyLevel);
 
	Question patchQuestion(Integer id, Question question);
 
	void deleteQuestionById(Integer id);
 
	Question getQuestionById(Integer id);
 
	Page<Question> findAllQuestions(Pageable pageable);
 

}
