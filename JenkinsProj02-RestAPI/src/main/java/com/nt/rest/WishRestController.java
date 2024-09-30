package com.nt.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishRestController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> wishMessage(){
		return new ResponseEntity<String>("Good AfterNoon::  "+   LocalDateTime.now(),HttpStatus.OK);
		
	}

}
