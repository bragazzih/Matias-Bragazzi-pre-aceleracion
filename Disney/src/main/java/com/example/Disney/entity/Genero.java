package com.example.Disney.entity;

import java.io.Serializable;
import java.util.List;
<<<<<<< HEAD
import java.util.Set;
=======
>>>>>>> stash

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ElementCollection;

@Entity
@Table(name = "Genero")

public class Genero implements Serializable {
	
	public Genero() {
		super();
	}

	private static final long serialVersionUID = 5264086901345824349L;
	
<<<<<<< HEAD
	public Genero(String imagen, String nombre, List<Pelicula>peliculasSeriesAsociadas) {
=======
	public Genero(String imagen, String nombre, List<Pelicula> peliculasSeriesAsociadas) {
>>>>>>> stash
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

	@OneToMany(mappedBy ="Genero")
	@JsonIgnore
	private List<Pelicula>PeliculasSeriesAsociadas;	
	
<<<<<<< HEAD

=======
	//private Long PeliculasSeriesAsociadas;
>>>>>>> stash
	
<<<<<<< HEAD
=======
	private List<Pelicula> PeliculasSeriesAsociadas;
	
>>>>>>> stash

	public Long getIDgenero() {
		return IDgenero;
	}

	public void setIDgenero(Long iDgenero) {
		IDgenero = iDgenero;
	}

	
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
	
<<<<<<< HEAD
=======
	@OneToMany(cascade= CascadeType.ALL, targetEntity = Pelicula.class)
	@JoinColumn(name= "id_pelicula", nullable= false)
>>>>>>> stash
	public List<Pelicula> getPeliculasSeriesAsociadas() {
		return PeliculasSeriesAsociadas;
	}

	public void setPeliculasSeriesAsociadas(List<Pelicula> peliculasSeriesAsociadas) {
		PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
	}


<<<<<<< HEAD
=======

>>>>>>> stash
}
