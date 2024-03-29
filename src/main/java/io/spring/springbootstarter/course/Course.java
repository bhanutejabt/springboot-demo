package io.spring.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.spring.springbootstarter.topic.Topic;

@Entity
public class Course {

	private String description;
	@Id
	private String id;
	private String name;

	@ManyToOne
	private Topic topic;

	public Course() {

	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
