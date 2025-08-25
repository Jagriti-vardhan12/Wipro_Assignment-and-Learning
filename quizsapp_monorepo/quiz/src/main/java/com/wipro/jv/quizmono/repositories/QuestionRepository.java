package com.wipro.jv.quizmono.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.jv.quizmono.entities.Question;
import com.wipro.jv.quizmono.enums.Category;
import com.wipro.jv.quizmono.enums.DifficultyLevel;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

//	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.difficulty_level = :difficulty ORDER BY RAND() LIMIT 3", nativeQuery = true)
//
//	List<Question> findRandomQuestionsByCategoryAndLevel(Category category, DifficultyLevel difficultylevel);
	
	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.difficulty_level = :difficulty ORDER BY RAND() LIMIT 3", nativeQuery = true)
	List<Question> findRandomQuestionsByCategoryAndLevel(@Param("category") Category category, @Param("difficulty") DifficultyLevel difficultyLevel);


	List<Question> findByCategoryAndDifficultyLevel(Category category, DifficultyLevel difficultyLevel);

//	List<Question> findByCategory(Category category);

}
