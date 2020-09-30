package io.typebusters.exercises.model.exercises;

/**
 * Describes the contract of courses being studied.
 *
 * @param <T> id type of the subject.
 * @author Georgy Isaev
 */
public interface CourseUnderStudy<T> {

    T getId();

    ExerciseUnderStudy<T> addExercise(T id, String text);

    boolean deleteExercise(T id);

}
