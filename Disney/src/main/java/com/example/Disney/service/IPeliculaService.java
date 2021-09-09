package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.entity.Pelicula;

public interface IPeliculaService {
public Pelicula savePelicula(Pelicula pelicula);
public List<PeliculaDto>findAll();
public Pelicula update(Long id, Pelicula pelicula);
public void delete (Long id);
	
}