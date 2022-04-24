package org.ask.controller;

import org.ask.Util;
import org.ask.model.Booking;
import org.ask.model.GenericResponse;
import org.ask.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	// get all bookings
	@GetMapping
	public ResponseEntity<GenericResponse> getAllEmployees() {
		GenericResponse response = new GenericResponse(Boolean.TRUE, HttpStatus.OK.value(), Util.SUCCESS,
				bookingService.findAll());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// create employee rest api
	@PostMapping("/create")
	public ResponseEntity<GenericResponse> createEmployee(@RequestBody Booking booking) {
		GenericResponse response = new GenericResponse(Boolean.TRUE, HttpStatus.OK.value(), Util.SUCCESS,
				bookingService.create(booking));

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// get employee by id rest api
	@GetMapping("/{id}")
	public ResponseEntity<GenericResponse> getEmployeeById(@PathVariable Long id) {
		GenericResponse response = new GenericResponse(Boolean.TRUE, HttpStatus.OK.value(), Util.SUCCESS,
				bookingService.get(id));

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// delete employee rest api
	@DeleteMapping("/{id}")
	public ResponseEntity<GenericResponse> deleteEmployee(@PathVariable Long id) {
		GenericResponse response = new GenericResponse(Boolean.TRUE, HttpStatus.OK.value(), Util.SUCCESS,
				bookingService.delete(id));

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
