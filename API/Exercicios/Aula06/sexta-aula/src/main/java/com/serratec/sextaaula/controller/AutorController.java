package com.serratec.sextaaula.controller;

import java.util.List;

import com.serratec.sextaaula.exception.NotFoundException;
import com.serratec.sextaaula.model.Autor;
import com.serratec.sextaaula.service.AutorService;

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
@RequestMapping("/autor")
public class AutorController {
   
    @Autowired
    AutorService service;

    @GetMapping
    public ResponseEntity<List<Autor>> getAll(@RequestParam (required=false) String campo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Lista Autores", "Lista retornada com sucesso");
        return new ResponseEntity<List<Autor>>(service.findAll(campo), headers, HttpStatus.ACCEPTED);
    }
    @GetMapping("/{id}")
        public ResponseEntity<Autor> getOne(@PathVariable Integer id) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Autor", "Retornado com sucesso");
        return new ResponseEntity<Autor>(service.findOne(id), headers, HttpStatus.ACCEPTED);
    }
    @PostMapping()//tirar dúvidas
    public ResponseEntity<String> postAutor(@RequestBody Autor autor) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Autor", "Adicionado com sucesso");
        return new ResponseEntity<String>(service.addLivro(autor), headers, HttpStatus.CREATED);
    
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putAtualizarCategoria(@RequestBody Autor autor, @PathVariable Integer id) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Autor", "Atualizado com sucesso");
        return new ResponseEntity<>(service.atualizarLivro(id, autor), headers, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAutor(@PathVariable Integer id) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Autor", "Deletado com sucesso");
        return new ResponseEntity<>(service.deletarAutor(id), headers, HttpStatus.OK);
    }
}
