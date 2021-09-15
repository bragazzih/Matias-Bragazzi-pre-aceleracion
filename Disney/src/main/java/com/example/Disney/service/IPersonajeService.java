package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.DetallePeliculaDto;
import com.example.Disney.dto.DetallePersonajeDto;
import com.example.Disney.dto.PeliculasAsociadasDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.dto.PersonajeGetDto;
import com.example.Disney.dto.PersonajesAsociadosDto;
import com.example.Disney.entity.Personaje;


public interface IPersonajeService {

	
public Personaje savePersonaje(PersonajeDto personajeDto);
public List<PersonajeGetDto>findAll();
public DetallePersonajeDto findById(Long id);
public Personaje update(Long id, PersonajeDto PersonajeDto);
public void delete (Long id);	
public List<Personaje> findByName( String name );
public List<Personaje> findByAge( Long age );
public PersonajesAsociadosDto findByMovieId( Long movies );
}