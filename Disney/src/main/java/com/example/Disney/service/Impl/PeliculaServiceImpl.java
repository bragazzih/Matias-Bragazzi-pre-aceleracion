package com.example.Disney.service.Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.Disney.Builder.PeliculaBuilder;
import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.dto.PeliculaGetDto;
import com.example.Disney.dto.PeliculaPersonajesAsociadosDto;
import com.example.Disney.dto.PeliculasPorGeneroDto;
import com.example.Disney.dto.DetallePeliculaDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;
import com.example.Disney.repository.GeneroRepository;
import com.example.Disney.repository.PeliculaRepository;
import com.example.Disney.repository.PersonajeRepository;
import com.example.Disney.service.IPeliculaService;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Repository
public class PeliculaServiceImpl implements IPeliculaService{
	
	
	@Autowired
	private PeliculaRepository peliculaRepository;
	
	@Autowired
	private PersonajeRepository personajeRepository;
	
	@Autowired
	private GeneroRepository generoRepository;
	
	
	

	@Override
	public Pelicula savePelicula(PeliculaDto peliculaDto) {
		Pelicula newPelicula= new PeliculaBuilder().withPeliculaDto(peliculaDto).build();
		newPelicula.setPersonajesAsociados((personajeRepository.findAll()));
		newPelicula.setGenero(peliculaDto.getGenero());
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
	@JsonIgnore
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
        detPelDto.setGenero(peliculaPorId.getGenero());

        return detPelDto;

    }
	
	

	@Override
	public Pelicula update(Long id, PeliculaDto peliculaDto) {
		Pelicula pelicula = peliculaRepository.findById(id).get();
		List<Personaje> personaje = personajeRepository.findAll();
		pelicula.setImagen (peliculaDto.getImagen());
		pelicula.setTitulo(peliculaDto.getTitulo());
		pelicula.setPersonajesAsociados(personaje);
		pelicula.setCalificacion(peliculaDto.getCalificacion());
		pelicula.setFechaCreacion(peliculaDto.getFechaCreacion());
		pelicula.setGenero(peliculaDto.getGenero());
		return peliculaRepository.save(pelicula);

		
	}

	@Override
	public void delete(Long id) {
		peliculaRepository.deleteById(id);
		
	}
	
	@Override
	@JsonIgnore
	public List<Pelicula> findByName( String name ){
		List<Pelicula> lista = peliculaRepository.findAll();
		
		return lista.stream().filter((p)->p.getTitulo().equals(name)).collect(Collectors.toList());
		
	} 
	
	@Override
	public List<PeliculasPorGeneroDto> findByGenreId( Long genre ){
        List<Pelicula> lista = peliculaRepository.findAll();      
        ArrayList<PeliculasPorGeneroDto> lstPeliculasPorGeneroDto = new ArrayList <PeliculasPorGeneroDto>();
        for (Pelicula varPelicula : lista) {
        	if(varPelicula.getGenero().getIDgenero() == genre) {
        	  PeliculasPorGeneroDto pelPorGenDto = new PeliculasPorGeneroDto();
        	  pelPorGenDto.setImagen (varPelicula.getImagen());
        	  pelPorGenDto.setTitulo(varPelicula.getTitulo());
        	  pelPorGenDto.setCalificacion(varPelicula.getCalificacion());
        	  pelPorGenDto.setFechaCreacion(varPelicula.getFechaCreacion());
        	  pelPorGenDto.setGenero(varPelicula.getGenero());
        		
        		lstPeliculasPorGeneroDto.add(pelPorGenDto);
        		
        		
        		
        		
        		
        	}
         
            
        }
        
        return lstPeliculasPorGeneroDto;

	}
	
	@Override
    public List<PeliculaGetDto> findAllOrder(String order){
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

                if(order.equals("ASC"))                {
                    Collections.sort(lstPeliculasDto);
                }
                else {
                	Collections.sort(lstPeliculasDto, Collections.reverseOrder());
                }



                return lstPeliculasDto;
            }
	
	
	
}

