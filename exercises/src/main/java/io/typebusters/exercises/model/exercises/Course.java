package io.typebusters.exercises.model.exercises;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("courses")
public class Course {
	
	@Id
	private String id;
	@Transient
	List<Exercise> exercises;

}
