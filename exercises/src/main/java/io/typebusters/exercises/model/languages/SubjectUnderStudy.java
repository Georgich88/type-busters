package io.typebusters.exercises.model.languages;

import io.typebusters.exercises.model.topics.TopicUnderStudy;

public interface SubjectUnderStudy<T> {

	T getId();

	TopicUnderStudy<T> addTopic(T id, String name);

	boolean deleteTopic(T id);

}
