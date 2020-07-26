package io.typebusters.exercises.model.languages;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.typebusters.exercises.model.topics.Topic;

@Document("programming_languages")
public class ProgrammingLanguage implements SubjectUnderStudy {
	
	@Id
	@NotBlank
	private String id;
	@NotBlank
	private String name;
	@NotNull
	private List<Topic> topics;

	// Constructors
	
	public ProgrammingLanguage() {
		this.topics = new ArrayList<>();
	}
	
	public ProgrammingLanguage(@NotBlank String id, @NotBlank String name) {
		this.id = id.toLowerCase();
		this.name = name;		
		this.topics = new ArrayList<>();
	}	
	
	// Getters and setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Topic> getTopics() {
		return List.copyOf(topics);
	}

	public void setTopics(List<Topic> topics) {
		this.topics = List.copyOf(topics);
	}
	
	public Topic addTopic(String id, String name) {
		Topic topic = new Topic(id, name);
		this.topics.add(topic);
		return topic;
	}
	

}
