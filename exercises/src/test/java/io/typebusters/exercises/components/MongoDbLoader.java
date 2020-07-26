package io.typebusters.exercises.components;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

import io.typebusters.exercises.model.languages.ProgrammingLanguage;
import io.typebusters.exercises.repositories.languages.ProgrammingLanguageRepository;

@Component
@ActiveProfiles("test")
public class MongoDbLoader implements CommandLineRunner {

	@Autowired
    private ProgrammingLanguageRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		ProgrammingLanguage java = new ProgrammingLanguage("java", "Java");
    	ProgrammingLanguage presistedLanguage = repository.save(java);
    	assertEquals(java, presistedLanguage);
		
	}
	
	

}
