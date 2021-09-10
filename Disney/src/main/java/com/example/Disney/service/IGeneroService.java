package com.example.Disney.service;

import java.util.List;

import com.example.Disney.dto.GeneroDto;
import com.example.Disney.dto.GeneroGetDto;
import com.example.Disney.entity.Genero;

public interface IGeneroService {
public Genero saveGenero(GeneroDto generoDto);
public List<GeneroGetDto> findAll();
public Genero update(Long id, GeneroDto generoDto);
public void delete (Long id);
	
}
