package com.rsriprasanth.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsriprasanth.springbootstarter.beans.Topic;
import com.rsriprasanth.springbootstarter.dao.TopicDAO;

/**
 * The Class TopicService.
 */
@Service
public class TopicService {
	
	@Autowired
	private TopicDAO topicRespository;
	
//	/** The topics. */
//	private List<Topic> topics = new ArrayList<>( Arrays.asList(
//			new Topic("spring","Spring Framework", "Spring FrameworkDescription"),
//			new Topic("java", "Java", "Java Description"),
//			new Topic("c","C Programming","C Programming Description")		
//			));  
	
	/**
	 * Gets the all topics.
	 *
	 * @return the all topics
	 */
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRespository.findAll().forEach(topics::add);
		return topics;
	}
	
	/**
	 * Gets the topic.
	 *
	 * @param id the id
	 * @return the topic
	 */
	public Topic getTopic(String id) {
		return topicRespository.findById(id).orElse(null);
	}
	
	/**
	 * Adds the topic.
	 *
	 * @param topic the topic
	 */
	public void addTopic(Topic topic) {
		topicRespository.save(topic);
	}
	
	/**
	 * Update topic.
	 *
	 * @param topic the topic
	 */
	public void updateTopic(Topic topic, String id) {
//		Topic updateTopic =topics.stream().filter(t -> (t.getId()).equalsIgnoreCase(id)).findFirst().get();
//		updateTopic.setName(topic.getName());
//		updateTopic.setId(topic.getId());
//		updateTopic.setDescription(topic.getDescription());
		topicRespository.save(topic);
	}
	
	/**
	 * Delete topic.
	 *
	 * @param id the id
	 */
	public void deleteTopic(String id) {
//		topics.removeIf(t -> (t.getId()).equalsIgnoreCase(id));
		topicRespository.deleteById(id);
	}
}
