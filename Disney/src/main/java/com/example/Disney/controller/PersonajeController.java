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

import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.entity.Personaje;
import com.example.Disney.service.IPersonajeService;

@RestController
@RequestMapping("/personaje")
@CrossOrigin("*")
public class PersonajeController {
	

	
	@Autowired
	private IPersonajeService personajeService;
	
	@PostMapping
	public ResponseEntity<?> SavePersonaje(@RequestBody PersonajeDto personajeDto){
	Personaje personaje = personajeService.savePersonaje(personajeDto);
	return new ResponseEntity<>(personaje, HttpStatus.ACCEPTED);		
				
	}
	
	
	@GetMapping
	public ResponseEntity<?> findAllPersonaje(){
		 return new ResponseEntity<>(personajeService.findAll(), HttpStatus.OK);
		 
		 	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?>updatePersonaje(@PathVariable(value= "id") Long id, @RequestBody PersonajeDto personajeDto){
		return new ResponseEntity<>(personajeService.update(id, personajeDto), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<?> deletePersonaje(@PathVariable(value = "id") Long id){
		personajeService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
		
	}
