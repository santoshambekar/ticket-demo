package org.ask;

import org.ask.model.User;
import org.ask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class DemoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = new User("yeshwanth", "111111");
		if (userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword()) == null) {
			userRepository.save(user);
		}
	}
}