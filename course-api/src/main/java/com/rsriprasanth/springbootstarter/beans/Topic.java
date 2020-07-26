package com.rsriprasanth.springbootstarter.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter @NoArgsConstructor
@Entity
public class Topic {
	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
