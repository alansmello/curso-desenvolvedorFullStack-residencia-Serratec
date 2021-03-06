package br.com.serratec.repositorios;

import java.util.HashMap;

import br.com.serratec.entidades.Autor;
import br.com.serratec.excecoes.CadastroExistenteException;
import br.com.serratec.excecoes.CadastroInexistenteException;

public class AutorRepositorio {
	private static HashMap<Integer, Autor> mapaAutores = new HashMap<Integer, Autor>();
	
	public static void adicionaAutor(Autor autor) {
		if (mapaAutores.containsKey(autor.getIdAutor())) {
			throw new CadastroExistenteException();
		}
		mapaAutores.put(autor.getIdAutor(), autor);
	}
	
	public static void removeAutor(int idAutor) {
		if (!mapaAutores.containsKey(idAutor)) {
			throw new CadastroInexistenteException();
		}
		mapaAutores.remove(idAutor);
	}
	
	public static Autor retornaAutor(int idAutor) {
		Autor autorPesquisado = mapaAutores.get(idAutor);
		if (autorPesquisado == null) {
			throw new CadastroInexistenteException();
		}
		return autorPesquisado;
	}
	
}
