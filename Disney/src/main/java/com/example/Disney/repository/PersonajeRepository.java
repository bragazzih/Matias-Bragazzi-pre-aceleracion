package com.example.Disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Disney.entity.Pelicula;
import com.example.Disney.entity.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {


}


