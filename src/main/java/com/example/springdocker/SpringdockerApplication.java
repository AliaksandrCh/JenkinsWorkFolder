package com.example.springdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SpringdockerApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);
	}

	@GetMapping(value = "/users/{id}")
	public ResponseEntity getUser(@PathVariable(value = "id") Long id){
		return new ResponseEntity<User>(userRepository.findOne(id), HttpStatus.OK);
	}

	@PostMapping(value = "/users")
	public ResponseEntity createUser(@RequestBody User user){
		User userFromDb = userRepository.save(user);
		return  new ResponseEntity<User>(userFromDb, HttpStatus.CREATED);
	}
}
