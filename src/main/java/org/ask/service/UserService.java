package org.ask.service;

import org.ask.Util;
import org.ask.model.User;
import org.ask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public String login(User user) throws Exception {
		
		if (Util.isNullOrEmpty(user.getUserName()) || Util.isNullOrEmpty(user.getPassword())) {
			throw new Exception("User name and password are mandatory!");
		}

		User validUser = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());

		if (validUser == null) {
			throw new Exception("User not found!");
		}

		return "Login Sucess!";
	}
}
