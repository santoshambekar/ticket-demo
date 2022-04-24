package org.ask.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.ask.model.Booking;
import org.ask.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	public String create(Booking booking) {
		String message = null;

		if (booking.getId() != null) {
			message = "Updated Successfully.";
		} else {
			message = "Created Successfully.";
		}

		bookingRepository.save(booking);
		return message;
	}

	public Booking get(Long id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		
		if (!booking.isPresent()) {
			throw new EntityNotFoundException();
		}
		return booking.get();
	}

	public String delete(Long id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		
		if (!booking.isPresent()) {
			throw new EntityNotFoundException();
		}
		bookingRepository.deleteById(id);

		return "Deleted Successfully.";
	}
}
