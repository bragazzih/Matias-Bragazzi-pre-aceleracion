package com.example.Disney.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name = "Peliculas")


public class Pelicula implements Serializable {
	
	private static final long serialVersionUID = 730656414716250101L;

public Pelicula(String imagen, String titulo, String fechaCreacion, Long calificacion,
			Long personajesAsocidados) {
		super();
		Imagen = imagen;
		Titulo = titulo;
		FechaCreacion = fechaCreacion;
		Calificacion = calificacion;
		PersonajesAsocidados = personajesAsocidados;
	}

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDpelicula;

public Pelicula(Long personajesAsocidados) {
	super();
	PersonajesAsocidados = personajesAsocidados;
}

@Column(length = 100)
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	
	private Long Calificacion;
	
	private Long PersonajesAsocidados;
	
	public Long getIDpelicula() {
		return IDpelicula;
	}

	public void setIDpelicula(Long iDpelicula) {
		IDpelicula = iDpelicula;
	}
	
	@Column(name="Titulo")
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	@Column(name="Fecha_creacion")
	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	@ManyToMany(cascade= CascadeType.ALL, targetEntity = Personaje.class)
	@JoinColumn(name= "id_personaje", nullable= false)
	public Long getPersonajesAsocidados() {
		return PersonajesAsocidados;
	}

	public void setPersonajes_asocidados(Long personajesAsocidados) {
		PersonajesAsocidados = personajesAsocidados;
	}

	@Column(name="Calificacion")
	public Long getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Long calificacion) {
		Calificacion = calificacion;
	}
	
	
	
	

}
