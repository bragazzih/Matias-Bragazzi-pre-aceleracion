package com.example.Disney.dto;

import java.util.Date;
import java.util.List;

import com.example.Disney.entity.Personaje;

public class PeliculaSaveDto {
	
	private Long Calificacion;
	
	private List<Personaje> PersonajesAsociados;
	
	private String Imagen;

	private String Titulo;
	
	private Date FechaCreacion;
	
	private Long IdGenero;
	

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

	public Date getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
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


	public Long getIdGenero() {
		return IdGenero;
	}

	public void setIdGenero(Long idGenero) {
		IdGenero = idGenero;
	}


	
}