package com.example.Disney.dto;

import java.util.List;

import com.example.Disney.entity.Personaje;

public class PeliculaGetDto  {
	
private long IDpelicula;
	
	private Long Calificacion;
	
	private List<Personaje> PersonajesAsociados;
	
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	
	public long getIDpelicula() {
		return IDpelicula;
	}

	public void setIDpelicula(long iDpelicula) {
		IDpelicula = iDpelicula;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		this.Imagen = imagen;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.FechaCreacion = fechaCreacion;
	}

	public Long getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Long calificacion) {
		Calificacion = calificacion;
	}

	public List<Personaje>getPersonajesAsociados() {
		return PersonajesAsociados;
	}

	public void setPersonajesAsocidados( List<Personaje> personajesAsociados) {
		PersonajesAsociados = personajesAsociados;
	}


	
	
}	
	


