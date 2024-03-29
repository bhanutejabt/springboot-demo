package io.spring.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {


	@Autowired
	private TopicRepository topicRepository;
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Spring Framework", "Description"),
//			new Topic("Java", "Java Framework", "Description"),
//			new Topic("Python", "Python Framework", "Description")));

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {

//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}

	public List<Topic> getAllTopics() {
//		return topics;
		List<Topic> topics=new ArrayList<>();

		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	return topicRepository.findOne(id);
	}

	public void updateTopic(String id, Topic topic) {

//		for (Topic t : topics) {
//			if (t.getId().equals(id)) {
//				topics.set(topics.indexOf(t), topic);
//			}
//		}

		topicRepository.save(topic);
	}

}
