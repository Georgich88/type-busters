package io.typebusters.exercises.repositories.languages;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.typebusters.exercises.ExercisesApplicationTests;
import io.typebusters.exercises.model.languages.ProgrammingLanguage;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@ContextConfiguration(classes = { ExercisesApplicationTests.class })
@TestPropertySource(locations = "/application-test.properties")
public class ProgrammingLanguageRepositoryTest {
	
    @Autowired
    private ProgrammingLanguageRepository repository;
    
    @Test
    public void injectedComponentsShouldNotBeNull() {
        assertThat(repository).isNotNull();
    }

    @Test
    public void shouldSaveNewProgrammingLanguage() {
    	ProgrammingLanguage java = new ProgrammingLanguage("java", "Java");
    	ProgrammingLanguage presistedLanguage = repository.save(java);
    	assertEquals(java, presistedLanguage);
    }
    
}
