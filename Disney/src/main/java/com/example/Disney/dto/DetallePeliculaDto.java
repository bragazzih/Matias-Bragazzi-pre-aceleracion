package com.example.Disney.dto;

import java.util.Date;
import java.util.List;

import com.example.Disney.entity.Genero;


public class DetallePeliculaDto {
		
		private Long Calificacion;
		
		private List<PeliculaPersonajesAsociadosDto> PersonajesAsociados;
		
		private String Imagen;

		private String Titulo;
		
		private Date FechaCreacion;
		
		private Genero genero;
		
		

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

		public List<PeliculaPersonajesAsociadosDto>getPersonajesAsociados() {
			return PersonajesAsociados;
		}

		public void setPersonajesAsocidados( List<PeliculaPersonajesAsociadosDto> personajesAsociados) {
			PersonajesAsociados = personajesAsociados;
		}

		public Genero getGenero() {
			return genero;
		}

		public void setGenero(Genero genero) {
			this.genero = genero;
		}



		
		
	}


