package com.wipro.jv.quizmono.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.jv.quizmono.entities.Question;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.repositories.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
	
	private final QuestionRepository questionRepository = null;

	public List<Question> getQuestionsByCategory(Category category) {
		
           return questionRepository.findByCategory(category);

    }

    public Question addQuestion(Question question) {
        
        return questionRepository.save(question);
    }
}
