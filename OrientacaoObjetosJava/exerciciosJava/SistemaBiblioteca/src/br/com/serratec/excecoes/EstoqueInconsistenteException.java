package br.com.serratec.excecoes;

public class EstoqueInconsistenteException extends Exception {

	@Override
	public String getMessage() {
		return "Estoque inconsistente. Faça uma verificação manual";
	}

}
