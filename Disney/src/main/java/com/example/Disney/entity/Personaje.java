package com.example.Disney.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Personaje")

public class Personaje implements Serializable {


	private static final long serialVersionUID = -4465621914197182483L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDpersonaje;
	
	private String Imagen;
	
	private String Nombre;
	
	private  Integer Edad;
	
	private Integer Peso;
	
	private Long Historia;
	
	private Long PeliculasAsociadas;

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

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	public Integer getPeso() {
		return Peso;
	}

	public void setPeso(Integer peso) {
		Peso = peso;
	}

	public Long getHistoria() {
		return Historia;
	}

	public void setHistoria(Long historia) {
		Historia = historia;
	}

	public Long getPeliculasAsociadas() {
		return PeliculasAsociadas;
	}

	public void setPeliculasAsociadas(Long peliculasAsociadas) {
		PeliculasAsociadas = peliculasAsociadas;
	}
	

}
