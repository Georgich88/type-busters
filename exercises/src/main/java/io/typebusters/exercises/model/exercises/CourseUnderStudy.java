package io.typebusters.exercises.model.exercises;

public interface CourseUnderStudy<T> {

	T getId();

	ExerciseUnderStudy<T> addExercise(T id, String text);

	boolean deleteExercise(T id);
}
