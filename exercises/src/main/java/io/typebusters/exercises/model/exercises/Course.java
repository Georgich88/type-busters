package io.typebusters.exercises.model.exercises;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Course implements CourseUnderStudy, Serializable {
	
	private static final long serialVersionUID = 5833164416273240874L;

	@Id
	@NotBlank
	private String id;
	
	List<ExerciseUnderStudy> exercises;

}
