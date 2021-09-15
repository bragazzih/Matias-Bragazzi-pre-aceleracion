package com.example.Disney.Builder;
import java.util.List;
import java.util.Set;

import com.example.Disney.dto.GeneroDto;
import com.example.Disney.entity.Genero;
import com.example.Disney.entity.Pelicula;

public class GeneroBuilder {

	private String Imagen;
	
	private String Nombre;
	
<<<<<<< HEAD
	private List<Pelicula>PeliculasSeriesAsociadas;

=======
	/*private Long PeliculasSeriesAsociadas;
	
>>>>>>> stash

	public GeneroBuilder withGeneroDto(GeneroDto GeneroDto) {
		this.Imagen = GeneroDto.getImagen();
		this.Nombre = GeneroDto.getNombre();
		this.PeliculasSeriesAsociadas = GeneroDto.getPeliculasSeriesAsociadas();
		return this;
	}

public Genero build () {
	return new Genero(this.Imagen,this.Nombre,this.PeliculasSeriesAsociadas);
	
}
	
<<<<<<< HEAD
=======
	*/
>>>>>>> stash
		
	}


