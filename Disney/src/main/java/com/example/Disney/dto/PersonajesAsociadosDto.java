package com.example.Disney.dto;

import java.util.List;

public class PersonajesAsociadosDto {

	private List<PeliculaPersonajesAsociadosDto> PersonajesAsociados;

	public List<PeliculaPersonajesAsociadosDto> getPersonajesAsociados() {
		return PersonajesAsociados;
	}

	public void setPersonajesAsociados(List<PeliculaPersonajesAsociadosDto> personajesAsociados) {
		PersonajesAsociados = personajesAsociados;
	}
	
	
}
