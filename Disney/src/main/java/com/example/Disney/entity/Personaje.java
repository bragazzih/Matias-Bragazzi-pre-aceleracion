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
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ElementCollection;

@Entity
@Table(name = "Personaje")

public class Personaje implements Serializable {


	private static final long serialVersionUID = -4465621914197182483L;
	

	public Personaje(String imagen, String nombre, Long edad, Long peso, String historia, Set<Pelicula> peliculasAsociadas) {
		super();
		Imagen = imagen;
		Nombre = nombre;
		Edad = edad;
		Peso = peso;
		Historia = historia;
		PeliculasAsociadas = peliculasAsociadas;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDpersonaje;
	
	private String Imagen;
	
	private String Nombre;
	
	private  Long Edad;
	
	private Long Peso;
	
	private String Historia;
	
	@ManyToMany(mappedBy = "PersonajesAsocidados")
	private Set<Pelicula>PeliculasAsociadas;

	@Column(name="Imagen")
	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	@Column(name="Nombre")
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Column(name="Edad")
	public Long getEdad() {
		return Edad;
	}

	public void setEdad(Long edad) {
		Edad = edad;
	}

	@Column(name="Peso")
	public Long getPeso() {
		return Peso;
	}

	public void setPeso(Long peso) {
		Peso = peso;
	}

	@Column(name="Historia")
	public String getHistoria() {
		return Historia;
	}

	public void setHistoria(String historia) {
		Historia = historia;
	}

	
	public Set<Pelicula> getPeliculasAsociadas() {
		return PeliculasAsociadas;
	}

	public void setPeliculasAsociadas(Set<Pelicula> peliculasAsociadas) {
		PeliculasAsociadas = peliculasAsociadas;
	}



}
