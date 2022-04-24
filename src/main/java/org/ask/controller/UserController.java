package org.ask.controller;

import org.ask.Util;
import org.ask.model.GenericResponse;
import org.ask.model.User;
import org.ask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<GenericResponse> createEmployee(@RequestBody User user) throws Exception {
		GenericResponse response = new GenericResponse(Boolean.TRUE, HttpStatus.OK.value(), Util.SUCCESS,
				userService.login(user));

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
