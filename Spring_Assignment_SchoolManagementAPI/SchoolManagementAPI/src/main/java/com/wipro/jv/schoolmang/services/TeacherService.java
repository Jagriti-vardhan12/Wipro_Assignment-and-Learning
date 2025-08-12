package com.wipro.jv.schoolmang.services;

import java.util.List;

import com.wipro.jv.schoolmang.entities.Teacher;
import com.wipro.jv.schoolmang.entities.enums.Qualification;

public interface TeacherService {


	List<Teacher> findByExperienceGreaterThan(int years);

	List<Teacher> findByQualification(Qualification qualification);

}
