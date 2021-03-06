package com.example.Disney.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ElementCollection;

@Entity
@Table(name = "Genero")

public class Genero implements Serializable {

    public Genero() {
        super();
    }

    private static final long serialVersionUID = 5264086901345824349L;

    public Genero(String imagen, String nombre, List<Pelicula>peliculasSeriesAsociadas) {
        super();
        Imagen = imagen;
        Nombre = nombre;
        PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero")
    private Long IDgenero;

    private String Imagen;

    private String Nombre;


    @OneToMany(mappedBy ="Genero")
    private List<Pelicula>PeliculasSeriesAsociadas;




    public Long getIDgenero() {
        return IDgenero;
    }

    public void setIDgenero(Long iDgenero) {
        IDgenero = iDgenero;
    }


    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Pelicula> getPeliculasSeriesAsociadas() {
        return PeliculasSeriesAsociadas;
    }

    public void setPeliculasSeriesAsociadas(List<Pelicula> peliculasSeriesAsociadas) {
        PeliculasSeriesAsociadas = peliculasSeriesAsociadas;
    }


}
