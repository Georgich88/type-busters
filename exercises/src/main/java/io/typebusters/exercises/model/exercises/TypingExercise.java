package io.typebusters.exercises.model.exercises;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

public class TypingExercise implements ExerciseUnderStudy<String>, Serializable {

	private static final long serialVersionUID = -3677106373186522494L;

	@Id
	@NotBlank
	private String id;

	@NotBlank
	private String textToType;

	// Constructors

	public TypingExercise() {
		this("");
	}

	public TypingExercise(@NotBlank String textToType) {
		this("", textToType);
	}

	public TypingExercise(@NotBlank String id, @NotBlank String textToType) {
		this.id = id;
		this.textToType = textToType;
	}

	// Getters and setters

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTextToType() {
		return textToType;
	}

	public void setTextToType(String textToType) {
		this.textToType = textToType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
