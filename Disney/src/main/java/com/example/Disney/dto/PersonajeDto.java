package com.example.Disney.dto;

public class PersonajeDto {
	private Long IDpersonaje;
	
	private String Imagen;
	
	private String Nombre;
	
	private  Long Edad;
	
	private Long Peso;
	
	private String Historia;
	
	private Long PeliculasAsociadas;
	
	public Long getIDpersonaje() {
		return IDpersonaje;
	}

	public void setIDpersonaje(Long iDpersonaje) {
		IDpersonaje = iDpersonaje;
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

	public Long getEdad() {
		return Edad;
	}

	public void setEdad(Long edad) {
		Edad = edad;
	}

	public Long getPeso() {
		return Peso;
	}

	public void setPeso(Long peso) {
		Peso = peso;
	}

	public String getHistoria() {
		return Historia;
	}

	public void setHistoria(String historia) {
		this.Historia = historia;
	}

	public Long getPeliculasAsociadas() {
		return PeliculasAsociadas;
	}

	public void setPeliculasAsociadas(Long peliculasAsociadas) {
		PeliculasAsociadas = peliculasAsociadas;
	}



	
	
}
