package com.example.Disney.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name = "Peliculas")


public class Pelicula implements Serializable {
	
	private static final long serialVersionUID = 730656414716250101L;

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDpelicula;

@Column(length = 100)
	private String Imagen;

	private String Titulo;
	
	private Long FechaCreacion;
	
	private Integer Calificacion;
	
	private String PersonajesAsocidados;

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Long getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Long fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public String getPersonajesAsocidados() {
		return PersonajesAsocidados;
	}

	public void setPersonajes_asocidados(String personajesAsocidados) {
		PersonajesAsocidados = personajesAsocidados;
	}

	public Integer getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		Calificacion = calificacion;
	}
	
	
	
	

}
