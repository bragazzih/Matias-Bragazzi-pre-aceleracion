package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.entity.Personaje;

public interface PersonajeService {
public Personaje savePelicula(PersonajeDto peliculaDto);
public List<Personaje>findAll();
public Personaje update(Long id, Personaje PeliculaDto);
public void delete (Long id);
	
}