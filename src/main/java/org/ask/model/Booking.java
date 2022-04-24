package org.ask.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bookings")
public class Booking extends AbstractBaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8793986524137403000L;

	private String title;
	
	private String trainNo;
	
	private String category;
	
	private String arrival;
	
	private String departure;
	
}
