package com.wipro.jv.studentmang.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.jv.studentmang.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {



}
