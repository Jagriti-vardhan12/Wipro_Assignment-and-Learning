package com.wipro.jv.schoolmang.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String schoolName;

	    private String schoolAddress;

	    @OneToOne(cascade = CascadeType.ALL)
	    private Teacher teachers;

		public Object getSchoolName() {
			
			return null;
		}

		public void setSchoolName(Object schoolName2) {
			
			
		}

		public Object getTeachers() {
			
			return null;
		}

		public void setTeachers(Object teachers2) {
			
			
		}

}
