package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.User;
import com.cg.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public User getUser(@PathVariable("userId") Long userId){
		return userRepository.findOne(userId);
		
	}
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public Iterable<User> findAll(){
		return userRepository.findAll();
		
	}
	
	@RequestMapping(value="/testUser", method=RequestMethod.GET)
	public User test(){
		User user=new User();
		user.setUserId((long) 1);
		user.setUsername("Ben");
		user.setEmail("ben@gmail.com");
		user.setPhone("9988776655");
		return user;
	}
	
}
