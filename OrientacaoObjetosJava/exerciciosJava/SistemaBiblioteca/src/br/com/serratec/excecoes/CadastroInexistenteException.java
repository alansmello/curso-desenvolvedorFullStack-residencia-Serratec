package br.com.serratec.excecoes;

public class CadastroInexistenteException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Cadastro não existe";
	}
	
}
