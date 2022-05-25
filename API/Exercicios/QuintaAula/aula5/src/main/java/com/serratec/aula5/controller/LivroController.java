package com.serratec.aula5.controller;

import java.util.List;

import javax.validation.Valid;
import com.serratec.aula5.exception.AccountNotExistException;
import com.serratec.aula5.model.Livro;
import com.serratec.aula5.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService service;
    
    @PostMapping
    public ResponseEntity<String> inserirLivro(@Valid @RequestBody Livro livro){
        service.addLivro(livro);
        HttpHeaders headers = new HttpHeaders();
        headers.add("livro", "livro inserido");
        return new ResponseEntity<String>("ok", headers, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getAll(@RequestParam(required = false)  String campo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("GET", "lista de Livros");
        return new ResponseEntity<List<Livro>>(service.listarTudo(campo), headers, HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> updateLivro(@Valid @PathVariable Integer id, @RequestBody Livro livro) throws AccountNotExistException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("update", "atualizado com sucesso");
        
        return new ResponseEntity<Livro>(service.atualizaLivro(id, livro), headers, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletarLivro(@PathVariable Integer id) throws AccountNotExistException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Delete", "Deletado com Sucesso");
        return new ResponseEntity<Boolean>(service.deletarLivro(id), headers, HttpStatus.OK);

    }
}
