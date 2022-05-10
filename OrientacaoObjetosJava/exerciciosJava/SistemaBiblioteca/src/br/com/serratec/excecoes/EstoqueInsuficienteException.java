package br.com.serratec.excecoes;

public class EstoqueInsuficienteException extends Exception {

	@Override
	public String getMessage() {
		return "Estoque insuficiente";
	}

}
