package com.example.Disney.dto;

import java.util.List;


public class DetallePeliculaDto {
		
		private Long Calificacion;
		
		private List<PeliculaPersonajesAsociadosDto> PersonajesAsociados;
		
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

		public List<PeliculaPersonajesAsociadosDto>getPersonajesAsociados() {
			return PersonajesAsociados;
		}

		public void setPersonajesAsocidados( List<PeliculaPersonajesAsociadosDto> personajesAsociados) {
			PersonajesAsociados = personajesAsociados;
		}


		
		
	}


