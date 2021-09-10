package com.example.Disney.dto;

import java.util.List;

import com.example.Disney.entity.Personaje;

public class PeliculaGetDto  {
	
	
	private String Imagen;

	private String Titulo;
	
	private String FechaCreacion;
	

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


	
	
}	
	


