package com.example.Disney.dto;

import java.util.Date;

public class PersonajePeliculasAsociadasDto {

private Long Calificacion;
	
	private String Imagen;

	private String Titulo;
	
	private Date FechaCreacion;
	

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		this.Imagen = imagen;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public Date getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.FechaCreacion = fechaCreacion;
	}

	public Long getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Long calificacion) {
		Calificacion = calificacion;
	}
	
	
}