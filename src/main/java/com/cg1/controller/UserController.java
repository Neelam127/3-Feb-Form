package com.cg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg1.Service.UserService;
import com.cg1.model.User;

import lombok.Getter;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> findAllUser(){
		return userService.findAllUser();
	}
	
	@GetMapping("/user/{userName}")
	public User findUserById(@PathVariable String userName) {
		return userService.findUserbyName(userName);
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/user/{userId}")
	public User updateUser(@RequestBody User user,@PathVariable String userId) {
		return userService.updateUser(user, userId);
	}
	
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable String userId) {
		userService.deleteUser(userId);
	}
}
