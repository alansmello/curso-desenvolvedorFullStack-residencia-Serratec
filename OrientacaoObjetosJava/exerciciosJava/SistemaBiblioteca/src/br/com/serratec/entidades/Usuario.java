package br.com.serratec.entidades;

import br.com.serratec.excecoes.DocumentoInvalidoException;
import br.com.serratec.excecoes.EstoqueInconsistenteException;
import br.com.serratec.excecoes.EstoqueInsuficienteException;
import br.com.serratec.excecoes.OperacaoInvalidaException;
import br.com.serratec.interfaces.Autenticacao;
import br.com.serratec.interfaces.Registro;
import br.com.serratec.validadores.ValidadorDocumento;

public abstract class Usuario implements Autenticacao, Registro {
	protected String nome;
	protected final String cpf;
	protected String telefone;
	protected Livro livroAlugado;
	
	public Usuario(String nome, String cpf, String telefone) throws DocumentoInvalidoException {
		this.nome = nome;
		this.cpf = ValidadorDocumento.validarCpf(cpf);
		this.telefone = telefone;
	}
	
	public final void alugarLivro(Livro livro) throws EstoqueInsuficienteException, OperacaoInvalidaException {
		if (!this.livroAlugado.equals(null)) {
			throw new OperacaoInvalidaException();
		}
		livro.aumentaQtdAlugado();
		this.livroAlugado = livro;
		System.out.println("O usuario " + this.nome + " alugou o livro " + this.livroAlugado.getTitulo());
	}
	
	public final void devolverLivro() throws OperacaoInvalidaException, EstoqueInconsistenteException {
		if (this.livroAlugado.equals(null)) {
			throw new OperacaoInvalidaException();
		}
		this.livroAlugado.diminuiQtdAlugado();
		System.out.println("O usuario " + this.nome + " devolveu o livro " + this.livroAlugado.getTitulo());
		this.livroAlugado = null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public Livro getLivroAlugado() {
		return livroAlugado;
	}
	
	
}