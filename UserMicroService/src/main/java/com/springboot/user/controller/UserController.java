package com.springboot.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.entity.User;
import com.springboot.user.service.UserService;
import com.springboot.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user/v1")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		log.info("Inside Save User of UserController");
		return userService.saveUser(user);
	}

	@GetMapping("/getAllUsersDetails")
	public List<User> getAllUsersDetails() {
		log.info("Inside Get All Users Details of UserController");
		return userService.getAllUsersDetails();
	}

	@GetMapping("/findUserById/{userId}")
	public User findDepartmentById(@PathVariable Long userId) {
		log.info("Inside Find User By Id of UserController");
		return userService.findUserById(userId);
	}
	
	@GetMapping("/getUserWithDepartment/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside Get User With Department By Id of UserController");
		return userService.getUserWithDepartment(userId);
	}

}
