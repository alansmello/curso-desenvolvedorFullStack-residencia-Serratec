package com.serratec.aula5.repository;

import java.util.List;
import java.util.Optional;

import com.serratec.aula5.model.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    // Optional<Livro> findByNumero(String string);
    Optional<Livro> findById(Integer id);
    List<Livro> findAll();
}
