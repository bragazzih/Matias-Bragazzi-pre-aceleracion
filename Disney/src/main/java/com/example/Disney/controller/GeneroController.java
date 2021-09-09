package com.example.Disney.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Disney.dto.GeneroDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.service.IGeneroService;


@RestController
@RequestMapping("/genero")
@CrossOrigin("*")
public class GeneroController {
	

	
	@Autowired
	private IGeneroService generoService;
	
	@PostMapping
	public ResponseEntity<?> SaveGenero(@RequestBody GeneroDto generoDto){
	Genero genero = generoService.saveGenero(generoDto);
	return new ResponseEntity<>(genero, HttpStatus.ACCEPTED);		
				
	}
	
	
	@GetMapping
	public ResponseEntity<?> findAllGenero(){
		 return new ResponseEntity<>(generoService.findAll(), HttpStatus.OK);
		 
		 	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?>updateGenero(@PathVariable(value= "id") Long id, @RequestBody GeneroDto generoDto){
		return new ResponseEntity<>(generoService.update(id, generoDto), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<?> deleteGenero(@PathVariable(value = "id") Long id){
		generoService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
		
	}


