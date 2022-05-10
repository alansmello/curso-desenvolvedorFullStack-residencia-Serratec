package br.com.serratec.excecoes;

public class OperacaoInvalidaException extends Exception {

	@Override
	public String getMessage() {
		return "Operação não permitida";
	}
	
}
