package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.GeneroDto;
import com.example.Disney.entity.Genero;

public interface GeneroService {
public Genero saveGenero(GeneroDto generoDto);
public List<Genero>findAll();
public Genero update(Long id, GeneroDto generoDto);
public void delete (Long id);
	
}
