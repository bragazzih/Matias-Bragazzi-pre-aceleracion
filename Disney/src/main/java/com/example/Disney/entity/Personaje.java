package com.example.Disney.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ElementCollection;

@Entity
@Table(name = "Personaje")
public class Personaje implements Serializable {


	public Personaje() {
		super();
	}

	private static final long serialVersionUID = -4465621914197182483L;
	

	public Personaje(String imagen, String nombre, Long edad, Long peso, String historia, List<Pelicula> peliculasAsociadas) {
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
	
	public Long getIDpersonaje() {
		return IDpersonaje;
	}

	public void setIDpersonaje(Long iDpersonaje) {
		IDpersonaje = iDpersonaje;
	}

	private String Imagen;
	
	private String Nombre;
	
	private  Long Edad;
	
	private Long Peso;
	
	private String Historia;
	

	@ManyToMany(mappedBy = "PersonajesAsociados")
	private List<Pelicula>PeliculasAsociadas;
	
	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Long getEdad() {
		return Edad;
	}

	public void setEdad(Long edad) {
		Edad = edad;
	}

	public Long getPeso() {
		return Peso;
	}

	public void setPeso(Long peso) {
		Peso = peso;
	}

	
	public String getHistoria() {
		return Historia;
	}

	public void setHistoria(String historia) {
		Historia = historia;
	}

	
	public List<Pelicula> getPeliculasAsociadas() {
		return PeliculasAsociadas;
	}

	public void setPeliculasAsociadas(List<Pelicula> peliculasAsociadas) {
		PeliculasAsociadas = peliculasAsociadas;
	}



}
