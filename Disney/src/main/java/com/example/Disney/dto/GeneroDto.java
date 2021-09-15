package com.example.Disney.dto;

import java.util.List;
import java.util.Set;

import com.example.Disney.entity.Pelicula;

public class GeneroDto {

	private String Imagen;
	
	private String Nombre;
	
	private List<Pelicula> PeliculasSeriesAsociadas;


	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		this.Imagen = imagen;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public List<Pelicula> getPeliculasSeriesAsociadas() {
		return PeliculasSeriesAsociadas;
	}

	public void setPeliculasSeriesAsociadas(List<Pelicula> peliculasSeriesAsociadas) {
		PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
	}
	
	

}
