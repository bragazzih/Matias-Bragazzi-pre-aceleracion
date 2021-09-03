package com.example.Disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Disney.entity.Genero;
import com.example.Disney.entity.Pelicula;

@Repository

public interface GeneroRepository extends JpaRepository<Genero, Long> {
	
}
