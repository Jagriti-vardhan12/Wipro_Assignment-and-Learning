package com.wipro.jv.quizmono.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jv.quizmono.Service.*;
import com.wipro.jv.quizmono.entities.*;
import com.wipro.jv.quizmono.enums.Category;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
 
@RestController
@RequiredArgsConstructor
@Slf4j
public class QuestionController {
	
private final QuestionService questionService = new QuestionService();


	
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable Category category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }
	
	
}

 
	
	
	
 
    