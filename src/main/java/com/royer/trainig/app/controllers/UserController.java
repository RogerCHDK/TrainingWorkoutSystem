package com.royer.trainig.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.royer.trainig.app.models.Users;
import com.royer.trainig.app.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired UserService service;
	
	@GetMapping
	public ResponseEntity<List<Users>> index(){
		List<Users> usersList = service.getAllUsers();
		return new ResponseEntity<List<Users>>(usersList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Users> createOrUpdateUser(Users user){
//		System.out.println(user.getName());
//		System.out.println(user.getId());
//		System.out.println(user.getEmail());
		Users updated = service.createOrUpdateUser(user);
		return new ResponseEntity<Users>(updated, new HttpHeaders(), HttpStatus.OK);
	}
}
