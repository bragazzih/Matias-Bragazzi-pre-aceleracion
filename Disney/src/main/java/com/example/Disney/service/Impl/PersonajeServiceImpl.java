package com.example.Disney.service.Impl;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Disney.Builder.PeliculaBuilder;
import com.example.Disney.Builder.PersonajeBuilder;
import com.example.Disney.dto.DetallePeliculaDto;
import com.example.Disney.dto.DetallePersonajeDto;
import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.dto.PeliculaPersonajesAsociadosDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.dto.PersonajeGetDto;
import com.example.Disney.dto.PersonajePeliculasAsociadasDto;
import com.example.Disney.dto.PersonajesAsociadosDto;
import com.example.Disney.dto.PeliculasAsociadasDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;
import com.example.Disney.repository.PeliculaRepository;
import com.example.Disney.repository.PersonajeRepository;
import com.example.Disney.service.IPersonajeService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import javax.persistence.Query;


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
    public List<PersonajeGetDto> findAll(){
		List<Personaje> lstPersonajes = personajeRepository.findAll();
		ArrayList<PersonajeGetDto> lstPersonajesGetDto = new ArrayList<PersonajeGetDto> ();
		    for(Personaje pertmp :  lstPersonajes)
		    {
		    	PersonajeGetDto perGetDto = new PersonajeGetDto();
		        perGetDto.setNombre(pertmp.getNombre());
		        perGetDto.setImagen(pertmp.getImagen());
		        
		        lstPersonajesGetDto.add(perGetDto);
		    }
			return lstPersonajesGetDto;
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
    public DetallePersonajeDto findById(Long id){
        Personaje personajePorId = personajeRepository.findById(id).get();
        ArrayList<PersonajePeliculasAsociadasDto> lstPersonajesPeliculasDto = new ArrayList <PersonajePeliculasAsociadasDto>();
        DetallePersonajeDto detPerDto = new DetallePersonajeDto();

        for (Pelicula varPelicula : personajePorId.getPeliculasAsociadas()) {

        	PersonajePeliculasAsociadasDto perPelDto = new PersonajePeliculasAsociadasDto();
        	perPelDto.setCalificacion(varPelicula.getCalificacion());
        	perPelDto.setFechaCreacion(varPelicula.getFechaCreacion());
        	perPelDto.setImagen(varPelicula.getImagen());
        	perPelDto.setTitulo(varPelicula.getTitulo());

        	lstPersonajesPeliculasDto.add(perPelDto);
        }

        detPerDto.setPeliculasAsociadas(lstPersonajesPeliculasDto);
        detPerDto.setEdad(personajePorId.getEdad());
        detPerDto.setHistoria(personajePorId.getHistoria());
        detPerDto.setImagen(personajePorId.getImagen());
        detPerDto.setNombre(personajePorId.getNombre());
        detPerDto.setPeso(personajePorId.getPeso());


        return detPerDto;

    }
	

	@Override
	public void delete(Long id) {
		personajeRepository.deleteById(id);
		
	}
	


	@Override
	@JsonIgnore
	public List<Personaje> findByName( String name ){
		List<Personaje> lista = personajeRepository.findAll();
		
		return lista.stream().filter((p)->p.getNombre().equals(name)).collect(Collectors.toList());
		
	} 
	
	@Override
	@JsonIgnore
	public List<Personaje> findByAge( Long age ){
		List<Personaje> lista = personajeRepository.findAll();
		
		return lista.stream().filter((p)->p.getEdad().equals(age)).collect(Collectors.toList());
		
	} 
	
	@Override
	public PersonajesAsociadosDto findByMovieId( Long movies ){
        Pelicula peliculaPorId = peliculaRepository.findById(movies).get();
        ArrayList<PeliculaPersonajesAsociadosDto> lstPeliculaPersonajesDto = new ArrayList <PeliculaPersonajesAsociadosDto>();
        PersonajesAsociadosDto detPelDto = new PersonajesAsociadosDto();

        for (Personaje varPersonaje : peliculaPorId.getPersonajesAsociados()) {

            PeliculaPersonajesAsociadosDto pelPerDto = new PeliculaPersonajesAsociadosDto();
            pelPerDto.setEdad(varPersonaje.getEdad());
            pelPerDto.setHistoria(varPersonaje.getHistoria());
            pelPerDto.setImagen(varPersonaje.getImagen());
            pelPerDto.setNombre(varPersonaje.getNombre());
            pelPerDto.setPeso(varPersonaje.getPeso());

            lstPeliculaPersonajesDto.add(pelPerDto);
        }

        detPelDto.setPersonajesAsociados(lstPeliculaPersonajesDto);


        return detPelDto;

    }
	
	
	}



