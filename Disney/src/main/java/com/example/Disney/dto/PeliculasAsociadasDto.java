package com.example.Disney.dto;

import java.util.List;

public class PeliculasAsociadasDto {

	private List <PersonajePeliculasAsociadasDto> PeliculasAsociadas;

	public List <PersonajePeliculasAsociadasDto> getPeliculasAsociadas() {
		return PeliculasAsociadas;
	}

	public void setPeliculasAsociadas(List <PersonajePeliculasAsociadasDto> peliculasAsociadas) {
		PeliculasAsociadas = peliculasAsociadas;
	}
	
}
