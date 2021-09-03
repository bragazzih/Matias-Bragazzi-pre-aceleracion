package com.example.Disney.Builder;

import com.example.Disney.dto.PeliculaDto;
import com.example.Disney.entity.Pelicula;

public class PeliculaBuilder {
	
	private Long IDpelicula;

	private Long Calificacion;
	
	private Long PersonajesAsocidados;
	
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	/*
	public PeliculaBuilder whithPeliculaDto(PeliculaDto PeliculaDto) {
		this.IDpelicula = PeliculaDto.getIDpelicula();
	    this.Calificacion = PeliculaDto.getCalificacion();
	    this.PersonajesAsocidados = PeliculaDto.getPersonajesAsocidados();
	    this.Imagen = PeliculaDto.getImagen();
	    this.Titulo = PeliculaDto.getTitulo();
	    this.FechaCreacion= PeliculaDto.getFechaCreacion();
		return this;
	}
	
	public Pelicula build() {
		return new Pelicula(this.Imagen, this.Titulo, this.FechaCreacion, this.Calificacion, this.PersonajesAsocidados);
		
	}
	*/
}


		
	

