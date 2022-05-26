package com.serratec.aula5.service;

import java.util.List;
import java.util.Optional;

import com.serratec.aula5.exception.AccountExistException;
import com.serratec.aula5.exception.AccountNotExistException;
import com.serratec.aula5.model.Livro;
import com.serratec.aula5.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;
/*
    public void verificarLivroExiste(Livro livro) throws AccountExistException {
		Optional<Livro> optional = livroRepository.findById(livro.getId());

		if (optional.isPresent()) {
			throw new AccountExistException("Essa conta ja existe");
		}
	}
 */   
    public void addLivro(Livro livro){
       
        livroRepository.save(livro);
       
    }

    public List<Livro> listarTudo(String campo){
        
        if(campo == null){
            return livroRepository.findAll();
        }
        Sort sort = Sort.by(campo);
        return livroRepository.findAll(sort);
    }

    public Livro atualizaLivro(Integer id, Livro livro) throws AccountNotExistException{
        
        Optional<Livro> optional = livroRepository.findById(id);

        if(optional.isEmpty()){
            throw new AccountNotExistException("Conta não existe!");
        }
        Livro oldLivro = optional.get();

        if(livro.getTitulo() != null){
            oldLivro.setTitulo(livro.getTitulo());;
        }if(livro.getTipo() != null){
            oldLivro.setTipo(livro.getTipo());
        }if(livro.getAutor() != null){
            oldLivro.setAutor(livro.getAutor());
        }if(livro.getDataPublicacao() != null){
            oldLivro.setDataPublicacao(livro.getDataPublicacao());
        }

        return oldLivro;
       
    }

    public Boolean deletarLivro(Integer id) throws AccountNotExistException{
        Optional<Livro> optional = livroRepository.findById(id);

        if(optional.isEmpty()){
            throw new AccountNotExistException("Conta não existe!");
        }
       // Livro livro = optional.get();
        livroRepository.deleteById(id);
        return true;
    }
    
}
