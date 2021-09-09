package com.example.Disney.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Disney.Builder.GeneroBuilder;
import com.example.Disney.Builder.PeliculaBuilder;
import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;
import com.example.Disney.repository.GeneroRepository;
import com.example.Disney.repository.PeliculaRepository;
import com.example.Disney.repository.PersonajeRepository;
import com.example.Disney.service.IPeliculaService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Repository
public class PeliculaServiceImpl implements IPeliculaService{
	
	
	@Autowired
	private PeliculaRepository peliculaRepository;
	
	@Autowired
	private PersonajeRepository personajeRepository;
	
	

	@Override
	public Pelicula savePelicula(PeliculaDto peliculaDto) {
		Pelicula newPelicula= new PeliculaBuilder().withPeliculaDto(peliculaDto).build();
		newPelicula.setPersonajesAsociados((personajeRepository.findAll()));
		return peliculaRepository.save(newPelicula);
	}

	@Override
    public List<PeliculaDto> findAll(){
			List<Pelicula> lstPeliculas = peliculaRepository.findAll();
			ArrayList<PeliculaDto> lstPeliculasDto = new ArrayList<PeliculaDto> ();
			    for(Pelicula pelitmp :  lstPeliculas)
			    {
			    	PeliculaDto pelDto = new PeliculaDto();
			        pelDto.setTitulo(pelitmp.getTitulo());
			        pelDto.setImagen(pelitmp.getImagen());
			        pelDto.setFechaCreacion(pelitmp.getFechaCreacion());
			        
			        lstPeliculasDto.add(pelDto);
			    }
				return lstPeliculasDto;
			}
		
	

	@Override
	public Pelicula update(Long id, Pelicula peliculaDto) {
		Pelicula pelicula = peliculaRepository.findById(id).get();
		List<Personaje> personaje = personajeRepository.findAll();
		pelicula.setImagen (peliculaDto.getImagen());
		pelicula.setTitulo(pelicula.getTitulo());
		pelicula.setPersonajesAsociados(personaje);
		pelicula.setCalificacion(peliculaDto.getCalificacion());
		pelicula.setFechaCreacion(peliculaDto.getFechaCreacion());
		return peliculaRepository.save(pelicula);

		
	}

	@Override
	public void delete(Long id) {
		peliculaRepository.deleteById(id);
		
	}
}

