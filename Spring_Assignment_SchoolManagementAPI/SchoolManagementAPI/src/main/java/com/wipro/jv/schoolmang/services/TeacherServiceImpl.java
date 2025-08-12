package com.wipro.jv.schoolmang.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.jv.schoolmang.entities.Teacher;
import com.wipro.jv.schoolmang.entities.enums.Qualification;
import com.wipro.jv.schoolmang.repo.TeacherRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

	private final TeacherRepo teacherRepo = null;

	@Override
	public List<Teacher> findByExperienceGreaterThan(int years) {

		return teacherRepo.findByExperienceGreaterThan(years);
	}

	@Override
	public List<Teacher> findByQualification(Qualification qualification) {

		return teacherRepo.findByQualification(qualification);
	}

}
