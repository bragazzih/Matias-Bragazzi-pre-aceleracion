package com.example.Disney.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Disney.Builder.PeliculaBuilder;
import com.example.Disney.Builder.PersonajeBuilder;
import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;
import com.example.Disney.repository.PeliculaRepository;
import com.example.Disney.repository.PersonajeRepository;
import com.example.Disney.service.IPersonajeService;


@Repository
public class PersonajeServiceImpl implements IPersonajeService {

	@Autowired
	private PersonajeRepository personajeRepository;
	
	@Autowired
	private PeliculaRepository peliculaRepository;
	

	@Override
	public Personaje savePersonaje(PersonajeDto personajeDto) {
		Personaje newPersonaje= new PersonajeBuilder().withPersonajeDto(personajeDto).Build();
		newPersonaje.setPeliculasAsociadas((peliculaRepository.findAll()));
		return personajeRepository.save(newPersonaje);
	}

	@Override
    public List<PersonajeDto> findAll(){
		List<Personaje> lstPersonajes = personajeRepository.findAll();
		ArrayList<PersonajeDto> lstPersonajesDto = new ArrayList<PersonajeDto> ();
		    for(Personaje pertmp :  lstPersonajes)
		    {
		    	PersonajeDto perDto = new PersonajeDto();
		        perDto.setNombre(pertmp.getNombre());
		        perDto.setImagen(pertmp.getImagen());
		        
		        lstPersonajesDto.add(perDto);
		    }
			return lstPersonajesDto;
		}
		
	
	

	@Override
	public Personaje update(Long id, PersonajeDto personajeDto) {
		Personaje personaje= personajeRepository.findById(id).get();
		List<Pelicula> pelicula = peliculaRepository.findAll();
		personaje.setImagen (personajeDto.getImagen());
		personaje.setNombre(personaje.getNombre());
		personaje.setPeliculasAsociadas(pelicula);
		personaje.setHistoria(personaje.getHistoria());
		personaje.setEdad(personaje.getEdad());
		personaje.setPeso(personaje.getPeso());
		return personajeRepository.save(personaje);

		
	}

	@Override
	public void delete(Long id) {
		personajeRepository.deleteById(id);
		
	}
}

