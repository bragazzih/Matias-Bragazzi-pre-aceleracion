package com.example.Disney.dto;

import java.util.Date;
import java.util.List;

import com.example.Disney.entity.Genero;

public class PeliculasPorGeneroDto {
	
	private String Imagen;

	private String Titulo;

	private Date FechaCreacion;
	
	private Long Calificacion;
	
	private Genero genero;

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
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

	public Long getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Long calificacion) {
		Calificacion = calificacion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
	
}
