package com.example.Disney.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Genero")

public class Genero implements Serializable {
	
	private static final long serialVersionUID = 5264086901345824349L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDgenero;
	
	private String Imagen;
	
	private String Nombre;
	
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

	public Long getPeliculasAsociadas() {
		return PeliculasAsociadas;
	}

	public void setPeliculasAsociadas(Long peliculasAsociadas) {
		PeliculasAsociadas = peliculasAsociadas;
	}


}
