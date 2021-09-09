package com.example.Disney.Builder;

import java.util.List;

import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;

public class PeliculaBuilder {
	

	private Long Calificacion;
	
	private List<Personaje>PersonajesAsociados;
	
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	
	public PeliculaBuilder withPeliculaDto(PeliculaDto PeliculaDto) {
	    this.Calificacion = PeliculaDto.getCalificacion();
	    this.PersonajesAsociados = PeliculaDto.getPersonajesAsociados();
	    this.Imagen = PeliculaDto.getImagen();
	    this.Titulo = PeliculaDto.getTitulo();
	    this.FechaCreacion= PeliculaDto.getFechaCreacion();
		return this;
	}
	
	public Pelicula build() {
		return new Pelicula(this.Imagen, this.Titulo, this.FechaCreacion, this.Calificacion, this.PersonajesAsociados);
		
	}
	
}


		
	

