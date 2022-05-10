package br.com.serratec.excecoes;

public class EnumInexistenteException extends Exception {

	@Override
	public String getMessage() {
		return "Enum não encontrado!";
	}
	
}
