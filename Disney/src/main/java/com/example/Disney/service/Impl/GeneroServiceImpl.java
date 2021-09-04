package com.example.Disney.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Disney.Builder.GeneroBuilder;
import com.example.Disney.dto.GeneroDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.repository.GeneroRepository;
import com.example.Disney.repository.PeliculaRepository;
import com.example.Disney.service.IGeneroService;
import com.example.Disney.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Disney.dto.PeliculaDto;

import javax.persistence.Id;



@Repository
public class GeneroServiceImpl implements IGeneroService {
	
	@Autowired
	private GeneroRepository generoRepository;
	
	@Autowired
	private PeliculaRepository peliculaRepository;
	
	

	@Override
	public Genero saveGenero(GeneroDto generoDto) {
		Genero newGenero= new GeneroBuilder().withGeneroDto(generoDto).build();
		newGenero.setPeliculasSeriesAsociadas((peliculaRepository.findAll()));
		return generoRepository.save(newGenero); 
	}

	@Override
	public List<Genero> findAll() {
		return generoRepository.findAll();
	}

	@Override
	public Genero update(Long id, GeneroDto generoDto) {

		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}


}