package org.ask.controller;

import org.ask.Util;
import org.ask.model.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<GenericResponse> exception(Exception exception) {
		return new ResponseEntity<>(
				new GenericResponse(Boolean.FALSE, HttpStatus.OK.value(), Util.FAIL, exception.getMessage()),
				HttpStatus.OK);
	}
}