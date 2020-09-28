package io.typebusters.exercises;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@DataMongoTest
@ActiveProfiles("test")
@ComponentScan({"io.typebusters.exercises.components"})
@TestPropertySource(locations = "/application-test.properties")
public class ExercisesApplicationTests {

	@Test
	void contextLoads() {
	}

}
