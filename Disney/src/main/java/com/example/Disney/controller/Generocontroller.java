package com.example.Disney.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Disney.service.IGeneroService;

@RestController
@RequestMapping("/genero")
@CrossOrigin("*")
public class Generocontroller {
	
	@Autowired
	private IGeneroService generoService;
	
	@GetMapping
	public ResponseEntity<?> findAllGenero(){
		 return new ResponseEntity<>(generoService.findAll(), HttpStatus.OK);
		
	}

}
