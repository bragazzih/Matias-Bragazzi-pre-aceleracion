package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.entity.Pelicula;

public interface PeliculaService {
public Pelicula savePelicula(PeliculaDto peliculaDto);
public List<Pelicula>findAll();
public Pelicula update(Long id, PeliculaDto PeliculaDto);
public void delete (Long id);
	
}