package io.typebusters.exercises.model.languages;

import io.typebusters.exercises.model.topics.Topic;
import io.typebusters.exercises.model.topics.TopicUnderStudy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document("programming_languages")
public class ProgrammingLanguage implements SubjectUnderStudy<String>, Serializable {

    private static final long serialVersionUID = -336931167214774010L;
    @NotBlank
    private final String name;
    @Id
    @NotBlank
    private String id;
    @NotNull
    private List<TopicUnderStudy<String>> topics;

    // Constructors

    public ProgrammingLanguage() {
        this("", "");
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

    public List<TopicUnderStudy<String>> getTopics() {
        return List.copyOf(topics);
    }

    public void setTopics(List<TopicUnderStudy<String>> topics) {
        this.topics = List.copyOf(topics);
    }

    @Override
    public Topic addTopic(String id, String name) {
        Topic topic = new Topic(id, name);
        this.topics.add(topic);
        return topic;
    }

    @Override
    public boolean deleteTopic(String id) {
        return topics.removeIf(topic -> topic.getId().equals(id));
    }

    // Object inherited methods

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProgrammingLanguage other = (ProgrammingLanguage) obj;
        if (id == null) {
            return other.id == null;
        } else return id.equals(other.id);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProgrammingLanguage [id=").append(id).append(", name=").append(name).append(", topics=")
                .append(topics).append("]");
        return builder.toString();
    }

}
