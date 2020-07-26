package io.typebusters.exercises.model.exercises;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Course {
	
	@Id
	private String id;
	
	List<Exercise> exercises;

}
