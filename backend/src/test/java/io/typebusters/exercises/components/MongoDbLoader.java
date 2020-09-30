package io.typebusters.exercises.components;

import io.typebusters.exercises.model.languages.ProgrammingLanguage;
import io.typebusters.exercises.repositories.languages.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MongoDbLoader implements CommandLineRunner {

    @Autowired
    private ProgrammingLanguageRepository repository;

    @Override
    public void run(String... args) throws Exception {
        ProgrammingLanguage java = new ProgrammingLanguage("java", "Java");
        java.addTopic("spring-boot-5", "Spring boot 5");
        java.addTopic("spring-boot-6", "Spring boot 6");
        java.addTopic("spring-boot-7", "Spring boot 7");
        repository.save(java);
        ProgrammingLanguage persistedLanguage = repository.findById("java").orElseThrow();
        System.out.println(persistedLanguage);
    }

}
