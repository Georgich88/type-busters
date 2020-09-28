package io.typebusters.exercises.model.topics;

import io.typebusters.exercises.model.exercises.CourseUnderStudy;

public interface TopicUnderStudy<T> {

	T getId();

	CourseUnderStudy<T> addCourse(T id, String name);

	boolean deleteCourse(T id);

}
