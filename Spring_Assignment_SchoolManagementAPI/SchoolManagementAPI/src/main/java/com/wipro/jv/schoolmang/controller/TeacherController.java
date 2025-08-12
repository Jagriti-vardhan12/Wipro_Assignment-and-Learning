package com.wipro.jv.schoolmang.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.wipro.jv.schoolmang.entities.Teacher;
import com.wipro.jv.schoolmang.entities.enums.Qualification;
import com.wipro.jv.schoolmang.services.TeacherService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TeacherController {
	
	
    private final TeacherService teacherService = null;

    
    @GetMapping("/experienced/{years}")
    public List<Teacher> getExperiencedTeachers(@PathVariable int years) {
        return teacherService.findByExperienceGreaterThan(years);
    }

    
    @GetMapping("/qualified/{qualification}")
    public List<Teacher> getByQualification(@PathVariable Qualification qualification) {
        return teacherService.findByQualification(qualification);
    }
    
}
