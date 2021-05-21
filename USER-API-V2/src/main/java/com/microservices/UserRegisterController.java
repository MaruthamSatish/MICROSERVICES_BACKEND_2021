package com.microservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/user")


public class UserRegisterController {
@Autowired
public UserRepository userRepository;

@Value("${config.value}")
private String configValue;

	@PostMapping("/signUp")
	public ResponseEntity<User> userSignUp(@RequestBody User user) {
		User userDetails = userRepository.insert(user);
		return new ResponseEntity<User>(userDetails,HttpStatus.CREATED);
	}
	@GetMapping("/signIn")
	public Optional<User> userSignIn(@RequestBody User user) {
    Optional<User> userDetails = userRepository.findByUserNameAndUserPassword(user.getUserName(),user.getUserPassword());
    
		return userDetails;
	}
	@GetMapping("/configServer")
	public String testConfigServer() {
		return configValue;
	}
}
