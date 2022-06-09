package com.serratec.sextaaula.repository;

import com.serratec.sextaaula.model.Autor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    
}
