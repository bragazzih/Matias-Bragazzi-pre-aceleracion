package com.example.Disney.dto;

import java.util.List;

public class DetallePersonajeDto {
		
		private String Imagen;
		
		private String Nombre;
		
		private  Long Edad;
		
		private Long Peso;
		
		private String Historia;
		
		private List <PersonajePeliculasAsociadasDto> PeliculasAsociadas;
		

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

		public List <PersonajePeliculasAsociadasDto> getPeliculasAsociadas() {
			return PeliculasAsociadas;
		}

		public void setPeliculasAsociadas(List<PersonajePeliculasAsociadasDto> peliculasAsociadas) {
			PeliculasAsociadas = peliculasAsociadas;
		}



		
		
	}