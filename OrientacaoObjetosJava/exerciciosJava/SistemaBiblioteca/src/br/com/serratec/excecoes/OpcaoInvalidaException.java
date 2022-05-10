package br.com.serratec.excecoes;

public class OpcaoInvalidaException extends Exception {

	@Override
	public String getMessage() {
		return "Opção inválida";
	}

}
