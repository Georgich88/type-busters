package io.typebusters.exercises.repositories.languages;

import io.typebusters.exercises.model.languages.ProgrammingLanguage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgrammingLanguageRepository extends MongoRepository<ProgrammingLanguage, String> {

}
