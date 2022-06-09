package com.serratec.sextaaula.controller;


import java.util.List;

import com.serratec.sextaaula.exception.NotFoundException;
import com.serratec.sextaaula.model.Livro;
import com.serratec.sextaaula.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {
    
    @Autowired
    LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> getAll(@RequestParam (required=false) String campo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Lista Livro", "Lista retornada com sucesso");
        return new ResponseEntity<List<Livro>>(service.findAll(campo), headers, HttpStatus.ACCEPTED);
    }
    @GetMapping("/{id}")
        public ResponseEntity<Livro> getOne(@PathVariable Integer id) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Livro", "Retornado com sucesso");
        return new ResponseEntity<Livro>(service.findOne(id), headers, HttpStatus.ACCEPTED);
    }
    @PostMapping("/{id}")//tirar dúvidas
    public ResponseEntity<String> postLivro(@RequestBody Livro livro, @PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Livro", "Adicionado com sucesso");
        return new ResponseEntity<String>(service.addLivro(livro), headers, HttpStatus.CREATED);
    
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> putAtualizarCategoria(@RequestBody Livro livro, @PathVariable Integer id) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Livro", "Atualizado com sucesso");
        return new ResponseEntity<>(service.atualizarLivro(id, livro), headers, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLivro(@PathVariable Integer id) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Livro", "Deletado com sucesso");
        return new ResponseEntity<>(service.deletarLivro(id), headers, HttpStatus.OK);
    }


}
