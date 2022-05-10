package br.com.serratec.entidades;

import java.time.LocalDate;

import br.com.serratec.enums.GeneroLivro;
import br.com.serratec.excecoes.AutenticacaoException;
import br.com.serratec.excecoes.DocumentoInvalidoException;

public final class Bibliotecario extends Usuario {
	private static int totalBibliotecariosCadastrados;
	
	private final String numFuncionario;
	
	public Bibliotecario(String nome, String cpf, String telefone, String numFuncionario) throws DocumentoInvalidoException{
		super(nome, cpf, telefone);
		this.numFuncionario = numFuncionario;
		System.out.println("Bibliotecário criado com sucesso");
		Bibliotecario.totalBibliotecariosCadastrados++;
	}
	
	@Override
	public void autenticar(String login) throws AutenticacaoException {
		if(!this.numFuncionario.equals(login)) {
			throw new AutenticacaoException();
		}
	}

	public String getNumFuncionario() {
		return numFuncionario;
	}
	
	public Livro cadastrarLivro(int id, String titulo, String edicao, GeneroLivro genero, Autor autor, int qtdEstoque) {
		return new Livro(id, titulo, edicao, genero, autor, this, qtdEstoque);
	}
	
	public Livro cadastrarLivro(int id, String titulo, String edicao, GeneroLivro genero, Autor autor, int qtdEstoque, LocalDate dataPublicacao) {
		return new Livro(id, titulo, edicao, genero, autor, this, qtdEstoque, dataPublicacao);
	}

	public static int getTotalBibliotecariosCadastrados() {
		return totalBibliotecariosCadastrados;
	}
	
}
