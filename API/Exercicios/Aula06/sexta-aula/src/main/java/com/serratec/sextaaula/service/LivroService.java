package com.serratec.sextaaula.service;

import java.util.List;
import java.util.Optional;

import com.serratec.sextaaula.exception.NotFoundException;
import com.serratec.sextaaula.model.Livro;
import com.serratec.sextaaula.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    LivroRepository repository;

    public List<Livro> findAll(String campo){
        if(campo == null){
            return repository.findAll();
        }
        Sort sort = Sort.by(campo);

        return repository.findAll(sort);
    }

    public Livro findOne(Integer id) throws NotFoundException{
        Optional<Livro> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new NotFoundException("Categoria não encontrada!");
        }
        
        return optional.get();
    }

    public String addLivro(Livro livroRecebido){
        
        repository.save(livroRecebido);
        return "Livro adicionado com Sucesso!";
    }

    public Livro atualizarLivro(Integer id, Livro livroNovo) throws NotFoundException{
        Optional<Livro> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new NotFoundException("Categoria não encontrada!");
        }
        Livro oldLivro = optional.get();
        
        if(livroNovo.getNome() != null && !livroNovo.getNome().equals("")){
            oldLivro.setNome(livroNovo.getNome());
        }if(livroNovo.getCategoriaId() != null){
            oldLivro.setCategoriaId(livroNovo.getCategoriaId());
        }
        repository.save(oldLivro);
        return oldLivro;
    }

    public String deletarLivro(Integer id) throws NotFoundException{
        Optional<Livro> optional = repository.findById(id);

        if(optional.isEmpty()){
            throw new NotFoundException("Categoria não encontrada!");
        }
        
        repository.deleteById(id);
        return "Livro deletado com Sucesso";
    }
}
