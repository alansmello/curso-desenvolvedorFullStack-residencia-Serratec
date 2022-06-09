package com.serratec.exercicio03.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.serratec.exercicio03.model.Todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    
    List <Todo> lista = new ArrayList<Todo>( Arrays.asList(new Todo(1,"Alan Mello","Aula API"), new Todo(2, "Cauã Stulpen Mello", "trabalho API"), new Todo(3,"Caíco Stulpen Mello", "Sobre nutrição")));
    

    public List<Todo> mostrarTodo(){
        return lista;
    }

    public Todo mostrarPorId(int id){
        for (Todo todoAtual : lista) {
            if(todoAtual.getId() == id){
                return todoAtual;
            }
        }
        return null;
        //return lista.get(id-1);
    }

    public void inserirTodo(Todo novo){
        lista.add(novo);
    }

    public Todo atualizarTodo(int id, Todo novo){
        Todo todo = lista.get(id-1);
        if(novo.getNome() != ""){
            todo.setNome(novo.getNome());
        }if(novo.getDescricao() != ""){
            todo.setDescricao(novo.getDescricao());
        }

        return todo;
    }

    public void removeTodo(int id){
        lista.remove(id-1);
    }

}
