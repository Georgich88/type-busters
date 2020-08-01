package io.typebusters.exercises.model.topics;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

public class Topic implements TopicUnderStudy, Serializable {

	private static final long serialVersionUID = -3690357397730716762L;
	
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

	// Object inherited method
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder
			.append("Topic [id=").append(id)
			.append(", name=").append(name).append("]");
		return builder.toString();
	}
	
	
	
}
