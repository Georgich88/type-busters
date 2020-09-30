package io.typebusters.exercises.model.exercises;

/**
 * Describes the contract of learning exercises.
 *
 * @param <T> id type of the subject.
 * @author Georgy Isaev
 */
public interface ExerciseUnderStudy<T> {

    T getId();

}
