package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.dto.PersonajeGetDto;
import com.example.Disney.entity.Personaje;

public interface IPersonajeService {
public Personaje savePersonaje(PersonajeDto personajeDto);
public List<PersonajeGetDto>findAll();
public Personaje update(Long id, PersonajeDto PersonajeDto);
public void delete (Long id);
	
}