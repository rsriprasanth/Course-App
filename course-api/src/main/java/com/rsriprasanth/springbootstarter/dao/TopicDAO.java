package com.rsriprasanth.springbootstarter.dao;

import org.springframework.data.repository.CrudRepository;

import com.rsriprasanth.springbootstarter.beans.Topic;

public interface TopicDAO extends CrudRepository<Topic, String> {
	
}
