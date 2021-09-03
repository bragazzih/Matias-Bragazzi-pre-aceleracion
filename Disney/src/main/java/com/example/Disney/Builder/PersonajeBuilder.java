package com.example.Disney.Builder;
import com.example.Disney.dto.PersonajeDto;
import com.example.Disney.entity.Personaje;

public class PersonajeBuilder {
	
	private String Imagen;
	
	private String Nombre;
	
	private  Long Edad;
	
	private Long Peso;
	
	private String Historia;
	
	private Long PeliculasAsociadas;
	
	/*
	public PersonajeBuilder withPersonajeDto(PersonajeDto PersonajeDto) {
		this.Nombre = PersonajeDto.getNombre();
		this.Edad = PersonajeDto.getEdad();
		this.Imagen = PersonajeDto.getImagen();
		this.Peso = PersonajeDto.getPeso();
		this.Historia =  PersonajeDto.getHistoria();
		this.PeliculasAsociadas = PersonajeDto.getPeliculasAsociadas();
		return this;
		
		
	}
	
	public Personaje Build () {
		return new Personaje(this.Imagen, this.Nombre, this.Edad, this.Peso, this.Historia, this.PeliculasAsociadas);
	

}
*/
}
