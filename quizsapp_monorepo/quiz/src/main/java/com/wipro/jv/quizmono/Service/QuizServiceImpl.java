package com.wipro.jv.quizmono.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.jv.quizmono.entities.Question;
import com.wipro.jv.quizmono.entities.QuestionWrapper;
import com.wipro.jv.quizmono.entities.Quiz;
import com.wipro.jv.quizmono.entities.Response;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.DifficultyLevel;
import com.wipro.jv.quizmono.repositories.QuestionRepository;
import com.wipro.jv.quizmono.repositories.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
	@Autowired

	private QuizRepository quizRepository;
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Quiz createQuiz(Category category, DifficultyLevel difficultyLevel, String quizTitle) {

		List<Question> questions = questionRepository.findByCategoryAndDifficultyLevel(category, difficultyLevel);

		Quiz quiz = new Quiz();

		quiz.setQuizTitle(quizTitle);
		quiz.setQuestions(questions);

		return quizRepository.save(quiz);
	}

	@Override
	public List<QuestionWrapper> getQuizQuestions(Integer id) {
		Optional<Quiz> quiz = quizRepository.findById(id);
		List<Question> questionFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionsForUser = new ArrayList<>();
		for (Question q : questionFromDB) {
			QuestionWrapper qw = new QuestionWrapper(q.getQuestionId(), q.getQuestionTitle(), q.getOption1(),
					q.getOption2(), q.getOption3(), q.getOption4());
			questionsForUser.add(qw);
		}
		return questionsForUser;
	}

	@Override
	public Integer calculateResult(int id, List<Response> responses) {
		Quiz quiz = quizRepository.findById(id).get();
		List<Question> questions = quiz.getQuestions();
		int right = 0;

		for (Response response : responses) {
			for (Question question : questions) {
				if (question.getQuestionId() == response.getId()) {
					if (question.getCorrectAnswer().equalsIgnoreCase(response.getResponse())) {
						right++;
					}
					break;
				}
			}
		}
		return right;
	}
}
