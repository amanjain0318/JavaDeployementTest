package com.learn.JavaDeployment;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.JavaDeployment.Entity.UserFeedback;

@RestController
@CrossOrigin
public class Testclass {
	/*
	 * @Autowired UserFeedback userFeedback;
	 */

	@GetMapping("/") 
	public String hello() { 
		//git token to remember
	  //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 
		return "hi , I am Application and i am running again and git token is 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";
		}

	@PostMapping(value = "/submitFeedback")
	public ResponseEntity<UserFeedback> RessponseEntitystoreUserFeedback(@RequestBody UserFeedback userFeedback) {
		return new ResponseEntity<>(userFeedback, HttpStatus.OK);

	}

}
