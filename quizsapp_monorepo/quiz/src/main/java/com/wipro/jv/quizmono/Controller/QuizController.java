package com.wipro.jv.quizmono.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jv.quizmono.Service.QuizService;
import com.wipro.jv.quizmono.entities.QuestionWrapper;
import com.wipro.jv.quizmono.entities.Quiz;
import com.wipro.jv.quizmono.entities.Response;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.DifficultyLevel;

//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;

@RestController
//@RequiredArgsConstructor
//@Slf4j
//@RequestMapping("/api/v1/quiz")
@RequestMapping("/api/v1/quiz")



public class QuizController {
	
	@Autowired

	private QuizService quizService;

	@PostMapping("/create")
	public Quiz createQuiz(@RequestParam Category category,@RequestParam DifficultyLevel difficultyLevel,@RequestParam String quizTitle) {
		
		return quizService.createQuiz(category,difficultyLevel,quizTitle);
	}
	
	@GetMapping("/getQuizById/{id}")
	public List<QuestionWrapper> getQuizQuestions(@PathVariable Integer id) {
		
		return quizService.getQuizQuestions(id);
	}
 
	@PostMapping("/submitQuiz/{id}")
	public Integer submitQuiz(@PathVariable int id,@RequestBody List<Response> responses) {
		
		return quizService.calculateResult(id,responses);
	}

}
