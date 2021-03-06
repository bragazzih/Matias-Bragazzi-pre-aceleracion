package com.example.Disney.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
	
	public Pelicula() {
		super();
	}

	private static final long serialVersionUID = 730656414716250101L;

public Pelicula(String imagen, String titulo, Date fechaCreacion, Long calificacion,
		List<Personaje> personajesAsociados, Genero genero) {
		super();
		Imagen = imagen;
		Titulo = titulo;
		FechaCreacion = fechaCreacion;
		Calificacion = calificacion;
		PersonajesAsociados = personajesAsociados;
		Genero = genero;
	}


@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDpelicula;


@Column(length = 100)
	private String Imagen;

	public String getImagen() {
	return Imagen;
}

public void setImagen(String imagen) {
	Imagen = imagen;
}

	private String Titulo;

	private Date FechaCreacion;
	
	private Long Calificacion;
	

	@ManyToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinTable(name= "Peliculas_personajes", joinColumns = @JoinColumn(name = "id_pelicula"), 
			  inverseJoinColumns = @JoinColumn(name = "id_personaje"))
	private List<Personaje>PersonajesAsociados; 
	
    
	@ManyToOne
	@JoinColumn(name = "id_genero",  nullable = false)
	private Genero Genero;
	

	public Long getIDpelicula() {
		return IDpelicula;
	}

	public void setIDpelicula(Long iDpelicula) {
		IDpelicula = iDpelicula;
	}
	
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Date getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public List<Personaje> getPersonajesAsociados() {
		return PersonajesAsociados;
	}

	public void setPersonajesAsociados(List<Personaje> personajesAsociados) {
		PersonajesAsociados = personajesAsociados;
	}

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
