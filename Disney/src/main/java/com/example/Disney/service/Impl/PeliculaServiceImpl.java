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
import com.example.Disney.dto.PeliculaPersonajesAsociadosDto;
import com.example.Disney.dto.DetallePeliculaDto;
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
    public DetallePeliculaDto findById(Long id){
        Pelicula peliculaPorId = peliculaRepository.findById(id).get();
        ArrayList<PeliculaPersonajesAsociadosDto> lstPeliculaPersonajesDto = new ArrayList <PeliculaPersonajesAsociadosDto>();
        DetallePeliculaDto detPelDto = new DetallePeliculaDto();

        for (Personaje varPersonaje : peliculaPorId.getPersonajesAsociados()) {

            PeliculaPersonajesAsociadosDto pelPerDto = new PeliculaPersonajesAsociadosDto();
            pelPerDto.setEdad(varPersonaje.getEdad());
            pelPerDto.setHistoria(varPersonaje.getHistoria());
            pelPerDto.setImagen(varPersonaje.getImagen());
            pelPerDto.setNombre(varPersonaje.getNombre());
            pelPerDto.setPeso(varPersonaje.getPeso());

            lstPeliculaPersonajesDto.add(pelPerDto);
        }

        detPelDto.setPersonajesAsocidados(lstPeliculaPersonajesDto);
        detPelDto.setCalificacion(peliculaPorId.getCalificacion());
        detPelDto.setFechaCreacion(peliculaPorId.getFechaCreacion());
        detPelDto.setImagen(peliculaPorId.getImagen());
        detPelDto.setTitulo(peliculaPorId.getTitulo());


        return detPelDto;

    }
	
	
		
	

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

