package com.example.Disney.dto;

public class PeliculaDto {
	
	private long IDpelicula;
	
	private Long Calificacion;
	
	private Long PersonajesAsocidados;
	
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	
	public long getIDpelicula() {
		return IDpelicula;
	}

	public void setIDpelicula(long iDpelicula) {
		IDpelicula = iDpelicula;
	}

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

	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.FechaCreacion = fechaCreacion;
	}

	public Long getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Long calificacion) {
		Calificacion = calificacion;
	}

	public Long getPersonajesAsocidados() {
		return PersonajesAsocidados;
	}

	public void setPersonajesAsocidados(Long personajesAsocidados) {
		PersonajesAsocidados = personajesAsocidados;
	}


	
	
}
