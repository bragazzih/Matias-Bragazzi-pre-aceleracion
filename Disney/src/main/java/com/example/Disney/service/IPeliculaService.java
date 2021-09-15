package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.dto.PeliculaGetDto;
import com.example.Disney.dto.PeliculasPorGeneroDto;
import com.example.Disney.dto.DetallePeliculaDto;
import com.example.Disney.entity.Pelicula;

public interface IPeliculaService {
public Pelicula savePelicula(PeliculaDto peliculaDto);
public List<PeliculaGetDto>findAll();
public DetallePeliculaDto findById(Long id);
public Pelicula update(Long id, PeliculaDto PeliculaDto);
public void delete (Long id);
public List<Pelicula> findByName( String name );
public List<PeliculasPorGeneroDto> findByGenreId(Long genre);
	
}