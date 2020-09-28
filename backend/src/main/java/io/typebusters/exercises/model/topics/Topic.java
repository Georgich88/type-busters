package io.typebusters.exercises.model.topics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

import io.typebusters.exercises.model.exercises.Course;
import io.typebusters.exercises.model.exercises.CourseUnderStudy;

public class Topic implements TopicUnderStudy<String>, Serializable {

	private static final long serialVersionUID = -3690357397730716762L;

	@Id
	@NotBlank
	private String id;

	@NotBlank
	private String name;

	private List<CourseUnderStudy<String>> courses;

	// Constructors

	public Topic() {
		this("", "");
	}

	public Topic(@NotBlank String id, @NotBlank String name) {
		super();
		this.id = id;
		this.name = name;
		this.courses = new ArrayList<>();
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

	@Override
	public CourseUnderStudy<String> addCourse(String id, String name) {
		CourseUnderStudy<String> course = new Course(id, name);
		courses.add(course);
		return course;
	}

	@Override
	public boolean deleteCourse(String id) {
		return courses.removeIf(course -> course.getId().equals(id));
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
		builder.append("Topic [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

}
