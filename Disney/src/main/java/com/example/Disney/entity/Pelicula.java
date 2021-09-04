package com.example.Disney.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ElementCollection;

@Entity
@Table (name = "Peliculas")


public class Pelicula implements Serializable {
	
	private static final long serialVersionUID = 730656414716250101L;

public Pelicula(String imagen, String titulo, String fechaCreacion, Long calificacion,
		List<Personaje> personajesAsocidados) {
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


@Column(length = 100)
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	
	private Long Calificacion;
	
	@ManyToMany(cascade= CascadeType.ALL, targetEntity = Pelicula.class)
	@JoinTable(name= "PeliculasPersonajes", joinColumns = @JoinColumn(name = "id_pelicula"), 
			  inverseJoinColumns = @JoinColumn(name = "id_personaje"))
	
	private List<Personaje>PersonajesAsocidados;
	
	@ManyToOne
	@JoinColumn(name = "id_genero", nullable= false)
	private Genero Genero;
	
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

	public List<Personaje> getPersonajesAsocidados() {
		return PersonajesAsocidados;
	}

	public void setPersonajesAsocidados(List<Personaje> personajesAsocidados) {
		PersonajesAsocidados = personajesAsocidados;
	}

	@Column(name="Calificacion")
	public Long getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Long calificacion) {
		Calificacion = calificacion;
	}

	public Genero getGenero() {
		return Genero;
	}

	public void setGenero(Genero genero) {
		Genero = genero;
	}


	
	
	
	

}
