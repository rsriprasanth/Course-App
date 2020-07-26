package com.rsriprasanth.springbootstarter.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/course/hello")
	public String Greeting() {
		return("Hello, Welcome to My Course API");
	}
}
