package com.wipro.jv.schoolmang.services;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.wipro.jv.schoolmang.entities.School;
import com.wipro.jv.schoolmang.repo.SchoolRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

	private final SchoolRepo schoolRepo = null;

	@Override
	public School save(School school) {
		return schoolRepo.save(school);
	}

	@Override
	public School findById(Long id) {
		return schoolRepo.findById(id).get();
		
	}

	@Override
	public School findBySchoolNameNative(String name) {
		return schoolRepo.findBySchoolNameNative(name);
	}

	@Override
	public int countAllSchools() {
		return schoolRepo.countAllSchools();
	}

	@Override
	public School updateSchoolPartial(Long id, School school) {
		School existing = schoolRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("School with ID " + id + " not found"));

		if (school.getSchoolName() != null) {
			existing.setSchoolName(school.getSchoolName());
		}

		if (school.getTeachers() != null) {
			existing.setTeachers(school.getTeachers());
		}

		return schoolRepo.save(existing);
	}

	@Override
	public School updateSchoolById(Long id, School school) {
		School existing = schoolRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("School with ID " + id + " not found"));

		existing.setSchoolName(school.getSchoolName());
		existing.setSchoolName(school.getSchoolName());
		existing.setTeachers(school.getTeachers());

		return schoolRepo.save(existing);
	}

	@Override
	public String deleteById(Long id) {
		schoolRepo.deleteById(id);
		return null;
	}

}
