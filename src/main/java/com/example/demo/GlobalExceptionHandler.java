package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<DefaultResponse> response(Exception e) {
		return ResponseEntity.badRequest().body(new DefaultResponse().setIsvalid(false).setRecord(e.getLocalizedMessage()));
	}

}
