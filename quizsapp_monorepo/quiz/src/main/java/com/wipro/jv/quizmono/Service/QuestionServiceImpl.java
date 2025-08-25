package com.wipro.jv.quizmono.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.jv.quizmono.entities.Question;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.DifficultyLevel;
import com.wipro.jv.quizmono.exception.ResourceNotFoundException;
import com.wipro.jv.quizmono.repositories.QuestionRepository;

//import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question save(Question question) {

		return questionRepository.save(question);
	}

	@Override
	public Question getQuestionById(Integer id) {

		return questionRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + id));
	}

	@Override
	public Page<Question> findAllQuestions(Pageable pageable) {

		return questionRepository.findAll(pageable);
	}

	@Override
	public Question patchQuestion(Integer id, Question question) {
		Question existing = questionRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + id));

		if (question.getQuestionTitle() != null)
			existing.setQuestionTitle(question.getQuestionTitle());
		if (question.getOption1() != null)
			existing.setOption1(question.getOption1());
		if (question.getOption2() != null)
			existing.setOption2(question.getOption2());
		if (question.getOption3() != null)
			existing.setOption3(question.getOption3());
		if (question.getOption4() != null)
			existing.setOption4(question.getOption4());
		if (question.getCorrectAnswer() != null)
			existing.setCorrectAnswer(question.getCorrectAnswer());
		if (question.getDifficultyLevel() != null)
			existing.setDifficultyLevel(question.getDifficultyLevel());
		if (question.getCategory() != null)
			existing.setCategory(question.getCategory());

		return questionRepository.save(existing);

	}

	@Override
	public void deleteQuestionById(Integer id) {
		if (!questionRepository.existsById(id)) {
			throw new ResourceNotFoundException("Cannot delete. Question not found with id " + id);
		}
		questionRepository.deleteById(id);
	}

	@Override
		public List<Question> findByCategoryAndDifficultyLevel(Category category, DifficultyLevel difficultyLevel) {
			
			return questionRepository.findByCategoryAndDifficultyLevel(category, difficultyLevel);
		

	

}

}
