package br.com.serratec.repositorios;

import java.util.HashMap;

import br.com.serratec.entidades.Autor;
import br.com.serratec.entidades.Livro;
import br.com.serratec.excecoes.CadastroExistenteException;
import br.com.serratec.excecoes.CadastroInexistenteException;

public class LivroRepositorio {
	private static HashMap<Integer, Livro> mapaLivros = new HashMap<Integer, Livro>();
	
	public static void adicionaLivro(Livro livro) {
		if (mapaLivros.containsKey(livro.getId())) {
			throw new CadastroExistenteException();
		}
		mapaLivros.put(livro.getId(), livro);
	}
	
	public static void removeLivro(int id) {
		if (!mapaLivros.containsKey(id)) {
			throw new CadastroInexistenteException();
		}
		mapaLivros.remove(id);
	}
	
	public static Livro retornaLivro(int id) {
		Livro livroPesquisado = mapaLivros.get(id);
		if (livroPesquisado == null) {
			throw new CadastroInexistenteException();
		}
		return livroPesquisado;
	}
	
}
