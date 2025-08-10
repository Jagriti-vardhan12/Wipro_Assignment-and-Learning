package com.wipro.jv.quizmono.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.jv.quizmono.entities.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
