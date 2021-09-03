package com.example.Disney.dto;

public class GeneroDto {
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

	public Long getPeliculasSeriesAsociadas() {
		return PeliculasSeriesAsociadas;
	}

	public void setPeliculasSeriesAsociadas(Long peliculasSeriesAsociadas) {
		PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
	}

}
