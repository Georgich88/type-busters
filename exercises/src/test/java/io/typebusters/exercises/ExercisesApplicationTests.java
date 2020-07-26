package io.typebusters.exercises;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootTest
@EnableMongoRepositories(basePackages = {"io.typebusters.exercises.repositories"})
public class ExercisesApplicationTests {

	@Test
	void contextLoads() {
	}

}
