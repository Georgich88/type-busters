package io.typebusters.exercises.repositories.exercises;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.typebusters.exercises.model.exercises.Course;

public interface CourseRepository extends MongoRepository<Course, String> {

}
