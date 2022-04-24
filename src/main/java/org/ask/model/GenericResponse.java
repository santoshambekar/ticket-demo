package org.ask.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Boolean status;
	private Integer code;
	private String message;
	private Object data;
	
	public GenericResponse() { }
	
	public GenericResponse(Boolean status) {
		super();
		this.status = status;
	}
	
	public GenericResponse(Boolean status, Integer code, String message) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
	}
	
	public GenericResponse(Boolean status, Integer code, String message, Object data) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
		this.data = data;
	}
}
