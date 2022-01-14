package com.learn.JavaDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testclass {

	@GetMapping("/")
	public String hello() {		
		return "hi , I am Application and i am running";
	}
}
