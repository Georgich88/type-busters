package io.typebusters.exercises.repositories.languages;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.typebusters.exercises.model.languages.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends MongoRepository<ProgrammingLanguage, String> {

}
