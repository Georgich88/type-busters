package io.typebusters.exercises.model.topics;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

public class Topic {

	@Id
	@NotBlank
	private String id;
	@NotBlank
	private String name;
	
	// Constructors
	
	public Topic() {
	}
	
	public Topic(@NotBlank String id, @NotBlank String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	// Getters and setters
	
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
	
	
	
}
