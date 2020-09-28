package io.typebusters.exercises.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import io.typebusters.exercises.model.languages.ProgrammingLanguage;
import io.typebusters.exercises.repositories.languages.ProgrammingLanguageRepository;

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
    	ProgrammingLanguage presistedLanguage = repository.findById("java").orElseThrow();
    	System.out.println(presistedLanguage);
	}
	
	

}
