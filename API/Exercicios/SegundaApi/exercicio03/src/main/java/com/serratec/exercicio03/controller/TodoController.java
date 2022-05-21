package com.serratec.exercicio03.controller;


import java.util.List;

import com.serratec.exercicio03.model.Todo;
import com.serratec.exercicio03.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/todo")
public class TodoController {
    
@Autowired
private TodoService service;
    
    @GetMapping
    public  List<Todo> getTodo(){
        return service.mostrarTodo();
    }

    @GetMapping("/{id}")
    public Todo getTodoId(@PathVariable int id){
        return service.mostrarPorId(id);
    }

    @PostMapping
    public String postTodo(@RequestBody Todo novo){
        service.inserirTodo(novo);
        return "Inserido com Sucesso";
    }

    @PutMapping("/{id}")
    public String PutTodo(@PathVariable int id, @RequestBody Todo novo){
        service.atualizarTodo(id, novo);
        return "Atualizado com Sucesso";
    } 

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable int id){
        service.removeTodo(id);
        return "Deletado com Sucesso";
    }
    
}
