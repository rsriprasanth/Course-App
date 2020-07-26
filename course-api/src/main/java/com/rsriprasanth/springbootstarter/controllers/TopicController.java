package com.rsriprasanth.springbootstarter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rsriprasanth.springbootstarter.beans.Topic;
import com.rsriprasanth.springbootstarter.service.TopicService;

/**Rest Controller helps Spring to understand during class path scanning that this class needs to be treated 
 * as a Rest Controller which manages the REST http requests to the appropriate responses**/
@RestController
public class TopicController {
	
	@Autowired //Used to declare dependency which needs to be injected
	private TopicService topicService;
	
	/**
	 * Gets the topics.
	 *
	 * @return the topics
	 */
	@GetMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopics();
	}
	
	/**
	 * Gets the topic.
	 *
	 * @param id the id
	 * @return the topic
	 */
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	/**
	 * Adds the topic.
	 *
	 * @param topic the topic
	 */
	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public void addTopic(@RequestBody Topic topic) { 
		topicService.addTopic(topic);
	}
	
	/**
	 * Update topic.
	 *
	 * @param topic the topic
	 */
	@PutMapping("/topics/{id}")
	public void updateTopic(
			@PathVariable String id,
			@RequestBody Topic topic) {
		topicService.updateTopic(topic, id);
	}
	
	/**
	 * Delete topic. 
	 *
	 * @param id the id
	 */
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
