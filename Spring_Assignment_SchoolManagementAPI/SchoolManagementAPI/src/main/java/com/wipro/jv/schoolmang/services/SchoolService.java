package com.wipro.jv.schoolmang.services;

import java.util.Map;

import com.wipro.jv.schoolmang.entities.School;

public interface SchoolService {

	School save(School school);

	School findById(Long id);

	School updateSchoolPartial(Long id, School school);

	School findBySchoolNameNative(String name);

	String deleteById(Long id);

	int countAllSchools();

	School updateSchoolById(Long id, School school);

	

}
