package io.typebusters.exercises.model.exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

public class Course implements CourseUnderStudy<String>, Serializable {

	private static final long serialVersionUID = 5833164416273240874L;

	@Id
	@NotBlank
	private String id;
	@NotBlank
	private String name;

	List<ExerciseUnderStudy<String>> exercises;

	// Constructors

	public Course() {
		this("", "");
	}

	public Course(@NotBlank String id, @NotBlank String name) {
		super();
		this.id = id;
		this.name = name;
		this.exercises = new ArrayList<>();
	}

	// Getters and setters

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ExerciseUnderStudy<String>> getExercises() {
		return List.copyOf(exercises);
	}

	@Override
	public ExerciseUnderStudy<String> addExercise(@NotBlank String id, @NotBlank String text) {
		ExerciseUnderStudy<String> addedExercise = new TypingExercise(id, text);
		exercises.add(addedExercise);
		return addedExercise;
	}

	@Override
	public boolean deleteExercise(String id) {
		return exercises.removeIf(exercise -> exercise.getId().equals(id));
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
