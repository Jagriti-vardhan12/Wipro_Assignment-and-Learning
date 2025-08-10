package com.wipro.jv.quizmono.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.jv.quizmono.entities.Question;
import com.wipro.jv.quizmono.entities.QuestionWrapper;
import com.wipro.jv.quizmono.entities.Quiz;
import com.wipro.jv.quizmono.entities.Response;
import com.wipro.jv.quizmono.repositories.QuestionRepository;
import com.wipro.jv.quizmono.repositories.QuizRepository;

import lombok.RequiredArgsConstructor;

	@Service
	@RequiredArgsConstructor
	public class QuizService {

		private  QuizRepository quizRepository ;
		private  QuestionRepository questionRepository;

		
		public Quiz createQuiz(String category, String level,  String title) {
		    List<Question> questions = questionRepository.findRandomQuestionsByCategoryAndLevel(category, level);

		    Quiz quiz = new Quiz();
		    quiz.setTitle(title);
		    quiz.setQuestions(questions);

		    return quizRepository.save(quiz);
		}




		    public List<QuestionWrapper> getQuizQuestions(Integer id) {
		    	
		    	//getting all questions for quiz
		        Optional<Quiz> quiz = quizRepository.findById(id);
		        
		        
		       List<Question> questionsFromDB = quiz.get().getQuestions();
		       
		        List<QuestionWrapper> questionsForUser = new ArrayList<>();
		        for(Question q : questionsFromDB){
		            QuestionWrapper qw = new QuestionWrapper();
		            questionsForUser.add(qw);
		        }

		        return questionsForUser;

		    }



			
		    public Integer calculateResult(int id, List<Response> responses) {
		        Quiz quiz = quizRepository.findById(id).get();
		        List<Question> questions = quiz.getQuestions();
		        int rightAnswerScore = 0;

		        for (Response response : responses) {
		            for (Question question : questions) {
		                if (question.getQuestionID() == response.getId()) {
		                    if (question.getCorrectAnswer().equalsIgnoreCase(response.getResponse())) {
		                    	rightAnswerScore++;
		                    }
		                    break; // no need to keep checking once matched
		                }
		            }
		        }

		        return rightAnswerScore;
		        
		    }
		    
	}
		
		
	