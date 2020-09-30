package io.typebusters.exercises.model.topics;

import io.typebusters.exercises.model.exercises.CourseUnderStudy;

/**
 * Describes the contract of topics being studied.
 *
 * @param <T> id type of the subject.
 * @author Georgy Isaev
 */
public interface TopicUnderStudy<T> {

    T getId();

    CourseUnderStudy<T> addCourse(T id, String name);

    boolean deleteCourse(T id);

}
