package com.example.Disney.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Genero")

public class Genero implements Serializable {
	
	private static final long serialVersionUID = 5264086901345824349L;
	
	public Genero(String imagen, String nombre, Long peliculasSeriesAsociadas) {
		super();
		Imagen = imagen;
		Nombre = nombre;
		PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDgenero;

	private String Imagen;
	
	private String Nombre;
	
	private Long PeliculasSeriesAsociadas;
	
	
	public Long getIDgenero() {
		return IDgenero;
	}

	public void setIDgenero(Long iDgenero) {
		IDgenero = iDgenero;
	}

	
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
	
	@OneToMany(cascade= CascadeType.ALL, targetEntity = Pelicula.class)
	@JoinColumn(name= "id_pelicula", nullable= false)
	public Long getPeliculasSeriesAsociadas() {
		return PeliculasSeriesAsociadas;
	}

	public void setPeliculasSeriesAsociadas(Long peliculasSeriesAsociadas) {
		PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
	}




}
