package com.example.Disney.dto;

import java.util.List;


public class PeliculaPersonajesAsociadosDto {
		
		private Long Calificacion;
		
		private List<PeliculaPersonajeDto> PersonajesAsociados;
		
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

		public Long getCalificacion() {
			return Calificacion;
		}

		public void setCalificacion(Long calificacion) {
			Calificacion = calificacion;
		}

		public List<PeliculaPersonajeDto>getPersonajesAsociados() {
			return PersonajesAsociados;
		}

		public void setPersonajesAsocidados( List<PeliculaPersonajeDto> personajesAsociados) {
			PersonajesAsociados = personajesAsociados;
		}


		
		
	}


