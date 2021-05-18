package com.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/userRegister")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRegisterController {
@Autowired
public UserRepository userRepository;
	@PostMapping
	
	public ResponseEntity<User> userSignUp(@RequestBody User user) {
		User userDetails = userRepository.insert(user);
		return new ResponseEntity<User>(userDetails,HttpStatus.CREATED);
		
		
	}
}
