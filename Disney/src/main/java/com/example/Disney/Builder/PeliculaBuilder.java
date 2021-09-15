package com.example.Disney.Builder;

import java.util.Date;
import java.util.List;

import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;

public class PeliculaBuilder {
	

	private Long Calificacion;
	
	private List<Personaje>PersonajesAsociados;
	
	private String Imagen;

	private String Titulo;
	
	private Date FechaCreacion;
	
	private Genero genero;
	
	public PeliculaBuilder withPeliculaDto(PeliculaDto PeliculaDto) {
	    this.Calificacion = PeliculaDto.getCalificacion();
	    this.PersonajesAsociados = PeliculaDto.getPersonajesAsociados();
	    this.Imagen = PeliculaDto.getImagen();
	    this.Titulo = PeliculaDto.getTitulo();
	    this.FechaCreacion= PeliculaDto.getFechaCreacion();
	    this.genero = PeliculaDto.getGenero();
		return this;
	}
	
	public Pelicula build() {
		return new Pelicula(this.Imagen, this.Titulo, this.FechaCreacion, this.Calificacion, this.PersonajesAsociados, this.genero);
		
	}
	
}


		
	

