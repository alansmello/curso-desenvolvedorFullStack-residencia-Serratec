package com.serratec.sextaaula.repository;

import com.serratec.sextaaula.model.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    
    
}
