package br.com.serratec.excecoes;

public class DocumentoInvalidoException extends Exception {

	@Override
	public String getMessage() {
		return "Documento inválido!";
	}
	
}

