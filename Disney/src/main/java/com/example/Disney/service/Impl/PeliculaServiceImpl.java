package com.example.Disney.service.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Disney.Builder.GeneroBuilder;
import com.example.Disney.Builder.PeliculaBuilder;
import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.dto.PeliculaGetDto;
import com.example.Disney.dto.PeliculaPersonajeDto;
import com.example.Disney.dto.PeliculaPersonajesAsociadosDto;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.dto.PersonajeGetDto;
import com.example.Disney.dto.PersonajeIdDto;
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
    public List<PeliculaGetDto> findAll(){
			List<Pelicula> lstPeliculas = peliculaRepository.findAll();
			ArrayList<PeliculaGetDto> lstPeliculasDto = new ArrayList<PeliculaGetDto> ();
			    for(Pelicula pelitmp :  lstPeliculas)
			    {
			    	PeliculaGetDto pelDto = new PeliculaGetDto();
			        pelDto.setTitulo(pelitmp.getTitulo());
			        pelDto.setImagen(pelitmp.getImagen());
			        pelDto.setFechaCreacion(pelitmp.getFechaCreacion());
			        
			        lstPeliculasDto.add(pelDto);
			    }
			    
				return lstPeliculasDto;
			}
	
	
	@Override
	public List<PeliculaPersonajesAsociadosDto>findById(Long id){
	Pelicula peliculaPorId = peliculaRepository.findById(id).get();
    List<Personaje> lstPersonajes = personajeRepository.findAll();
    List<Pelicula> lstPeliculas = peliculaRepository.findAll();
    ArrayList<PeliculaPersonajeDto> lstPeliculaPersonajesDto = new ArrayList <PeliculaPersonajeDto>();
    ArrayList<PersonajeIdDto> lstPersonajeId = new ArrayList<PersonajeIdDto>();
    ArrayList<PeliculaPersonajesAsociadosDto> personajesAsociados =  new ArrayList<PeliculaPersonajesAsociadosDto>();
     
    for(Personaje personaje: lstPersonajes) {
		PeliculaPersonajeDto peDto = new PeliculaPersonajeDto();
		PersonajeIdDto peId = new PersonajeIdDto();
		peDto.setEdad(personaje.getEdad());
		peDto.setHistoria(personaje.getHistoria());
		peDto.setImagen(personaje.getImagen());
		peDto.setNombre(personaje.getNombre());
		peDto.setPeso(personaje.getPeso());
		peDto.setIDpersonaje(personaje.getIDpersonaje());
		
		lstPeliculaPersonajesDto.add(peDto);
		lstPersonajeId.add(peId);
		
    }
    
    
	   
            PeliculaPersonajesAsociadosDto peliTmp = new PeliculaPersonajesAsociadosDto();
			peliTmp.setCalificacion(peliculaPorId.getCalificacion());
			peliTmp.setFechaCreacion(peliculaPorId.getFechaCreacion());
			peliTmp.setImagen(peliculaPorId.getImagen());
			peliTmp.setTitulo(peliculaPorId.getTitulo());
			for(Pelicula peliculaId: lstPeliculas) {
			for(Personaje personajeId: lstPersonajes) {
			if(personajeId.getIDpersonaje() == peliculaId.getIDpelicula()) {
				
			peliTmp.setPersonajesAsocidados(lstPeliculaPersonajesDto);
			personajesAsociados.add(peliTmp);
			}
						
			
            
		
		
		
			
	}
			
			}
			return personajesAsociados;	
	}
	
	
	
	/* Pelicula pelicula = peliculaRepository.findById(id).get();
	List<Pelicula> lstPeliculas = peliculaRepository.findAll();
	ArrayList<PeliculaDto> Pelicula = new ArrayList <PeliculaDto>();
	// ArrayList<PeliculaPersonajesAsociadosDto> lstPersonajesAsociados = new ArrayList<PeliculaPersonajesAsociadosDto>();
	// ArrayList<Pelicula> detallePelicula = new ArrayList <Pelicula>();
	List<Personaje> lstPersonajes = personajeRepository.findAll();
	ArrayList<PeliculaPersonajeDto> detallePelicula = new ArrayList <PeliculaPersonajeDto>();
	//ArrayList<PersonajeIdDto> lstPersonajeId = new ArrayList<PersonajeIdDto>();
	// List<Personaje> lstPersonajes = personajeRepository.findAll();
	// Personaje personaje = personajeRepository.findById(id).get(); 
	
	// for(Personaje personajetmp :  lstPersonajes) {
	
	/*
	  for(Personaje personaje: lstPersonajes) {
		PeliculaPersonajeDto peDto = new PeliculaPersonajeDto();
		PersonajeIdDto peId = new PersonajeIdDto();
		peDto.setEdad(personaje.getEdad());
		peDto.setHistoria(personaje.getHistoria());
		peDto.setImagen(personaje.getImagen());
		peDto.setNombre(personaje.getNombre());
		peDto.setPeso(personaje.getPeso());
		peDto.setIDpersonaje(personaje.getIDpersonaje());
		
		lstPeliculaPersonajesDto.add(peDto);
		lstPersonajeId.add(peId);
		
		
   }
	*/
	//}
			
	
	  // for(Pelicula pelitmp :  lstPeliculas)
	   /*
	        PeliculaPersonajesAsociadosDto pelDto = new PeliculaPersonajesAsociadosDto ();
	        pelDto.setTitulo(pelicula.getTitulo());
	        pelDto.setImagen(pelicula.getImagen());
	        pelDto.setCalificacion(pelicula.getCalificacion());
	        pelDto.setFechaCreacion(pelicula.getFechaCreacion());
	       /* for(Pelicula pel : lstPeliculas) {
	        int x;
	        x ++ ;
	        if(lstPeliculas[x]  == 
	        { */
		/*
	        pelDto.setPersonajesAsocidados(pelicula.getPersonajesAsociados());
	        
	        
	       
	        
	        detallePelicula.add(pelDto);
	 //  }
	    
		return detallePelicula;
	}
	*/
	
	
		
	

	@Override
	public Pelicula update(Long id, PeliculaDto peliculaDto) {
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

