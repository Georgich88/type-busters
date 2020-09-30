package io.typebusters.exercises.model.languages;

import io.typebusters.exercises.model.topics.TopicUnderStudy;

/**
 * Describes the contract of subjects being studied.
 *
 * @param <T> id type of the subject
 * @author Georgy Isaev
 */
public interface SubjectUnderStudy<T> {

    T getId();

    TopicUnderStudy<T> addTopic(T id, String name);

    boolean deleteTopic(T id);

}
