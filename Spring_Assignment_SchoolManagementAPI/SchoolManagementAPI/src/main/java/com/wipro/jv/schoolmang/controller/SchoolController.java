package com.wipro.jv.schoolmang.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jv.schoolmang.entities.School;
import com.wipro.jv.schoolmang.services.SchoolService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SchoolController {
	
    
    private final SchoolService schoolService = null;

    
    @PostMapping("/createNewSchool")
    public School createSchool(@RequestBody School school) {
        return schoolService.save(school);
    }

    
    @GetMapping("/getSchoolById/{id}")
    public School getSchool(@PathVariable Long id) {
       return schoolService.findById(id);
    }

    
    @PutMapping("/updateSchoolById/{id}")
    public School updateSchool(@PathVariable Long id, @RequestBody School school) {
    	
    	return schoolService.updateSchoolById(id,school);
    }

    
    @PatchMapping("/patchUpdateSchoolById/{id}")
    public School patchSchool(@PathVariable Long id, @RequestBody School school) {
        
        return schoolService.updateSchoolPartial(id,school);
    }

    
    @DeleteMapping("/deleteSchoolById/{id}")
    public String deleteSchool(@PathVariable Long id) {
        schoolService.deleteById(id);
		return "School Deleted Successfully";
    }

    
    @GetMapping("/name/{name}")
    public School getBySchoolName(@PathVariable String name) {
        return schoolService.findBySchoolNameNative(name);
    }

    
    @GetMapping("/count")
    public int countSchools() {
        return schoolService.countAllSchools();
    }

}
