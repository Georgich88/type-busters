package io.typebusters.exercises.repositories.exercises;

import io.typebusters.exercises.model.exercises.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

}
