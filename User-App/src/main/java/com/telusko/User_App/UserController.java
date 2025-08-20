package com.telusko.User_App;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsersList()
	{
		List<User> usersList = userRepo.findAll();
		
		return new ResponseEntity<List<User>>(usersList, HttpStatus.OK);
	}
}
