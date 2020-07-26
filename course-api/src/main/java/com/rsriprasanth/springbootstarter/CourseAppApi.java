package com.rsriprasanth.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * The Spring Boot Application Annotation does the following:
 * 1.Sets up the default configuration -- As Spring Boot is opinionated
 * 2.Starts the spring application context 
 * 3.Performs the class path scan
 * 4.Starts the Tomcat Server
 */
@SpringBootApplication //To help spring identify that the spring boot application starts here 

public class CourseAppApi {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	/**
	 * The static SpringApplication.run accepts two parameters 
	 * 1.The class -- which is CourseAppApi.class
	 * 2.The arguments for the main method which is args	
	 **/
		SpringApplication.run(CourseAppApi.class, args); // For creating a servlet container and hosting the spring application
	}
}
