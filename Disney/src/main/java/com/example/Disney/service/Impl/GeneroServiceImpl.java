package com.example.Disney.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Disney.Builder.GeneroBuilder;
import com.example.Disney.dto.GeneroDto;
import com.example.Disney.dto.GeneroGetDto;
import com.example.Disney.dto.PeliculaGetDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.repository.GeneroRepository;
import com.example.Disney.repository.PeliculaRepository;
import com.example.Disney.service.IGeneroService;
import com.example.Disney.entity.Pelicula;
import org.springframework.stereotype.Repository;



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
    public List<GeneroGetDto> findAll(){
			List<Genero> lstGeneros = generoRepository.findAll();
			ArrayList<GeneroGetDto> lstGeneroGetDto = new ArrayList<GeneroGetDto>();
			    for(Genero generotmp :  lstGeneros)
			    {
			    	GeneroGetDto genDto = new GeneroGetDto();
			        genDto.setImagen(generotmp.getImagen());
			        genDto.setNombre(generotmp.getNombre());
			        
			        
			        
			        lstGeneroGetDto.add(genDto);
			    }
			    
			    
				return lstGeneroGetDto;
			}

		 

	@Override
	public Genero update(Long id, GeneroDto generoDto) {
		Genero genero = generoRepository.findById(id).get();
		List<Pelicula> pelicula = peliculaRepository.findAll();
		genero.setImagen(generoDto.getImagen());
		genero.setNombre(genero.getNombre());
		genero.setPeliculasSeriesAsociadas(pelicula);
		return generoRepository.save(genero);

		
	}

	@Override
	public void delete(Long id) {
		generoRepository.deleteById(id);
		
	}
}



