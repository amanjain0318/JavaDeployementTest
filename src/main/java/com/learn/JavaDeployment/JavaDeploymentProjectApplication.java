package com.learn.JavaDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class JavaDeploymentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDeploymentProjectApplication.class, args);
	}

}


