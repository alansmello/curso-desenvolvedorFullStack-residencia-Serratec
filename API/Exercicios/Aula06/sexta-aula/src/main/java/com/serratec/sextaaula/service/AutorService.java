package com.serratec.sextaaula.service;

import java.util.List;
import java.util.Optional;

import com.serratec.sextaaula.exception.NotFoundException;
import com.serratec.sextaaula.model.Autor;
import com.serratec.sextaaula.repository.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    AutorRepository repository;

    public List<Autor> findAll(String campo){
        if(campo == null){
            return repository.findAll();
        }
        Sort sort = Sort.by(campo);

        return repository.findAll(sort);
    }
    public Autor findOne(Integer id) throws NotFoundException{
        Optional<Autor> optional = repository.findById(id);
        
        if(optional.isEmpty()){
            throw new NotFoundException("Categoria não encontrada!");
        }
        
        return optional.get();
    }
    public String addLivro(Autor autorRecebido){
        
        repository.save(autorRecebido);
        return "Livro adicionado com Sucesso!";
    }

    public Autor atualizarLivro(Integer id, Autor autorNovo) throws NotFoundException{
        Optional<Autor> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new NotFoundException("Categoria não encontrada!");
        }
        Autor oldAutor = optional.get();
        
        if(autorNovo.getNome() != null && !autorNovo.getNome().equals("")){
            oldAutor.setNome(autorNovo.getNome());
        }
        repository.save(oldAutor);
        return oldAutor;
    }

    public String deletarAutor(Integer id) throws NotFoundException{
        Optional<Autor> optional = repository.findById(id);

        if(optional.isEmpty()){
            throw new NotFoundException("Categoria não encontrada!");
        }
        repository.deleteById(id);
        return "Autordeletado com Sucesso";
    }
}
