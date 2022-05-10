package br.com.serratec.validadores;

import br.com.serratec.excecoes.DocumentoInvalidoException;

public class ValidadorDocumento {
	public static String validarCpf(String cpf) throws DocumentoInvalidoException {
		if(cpf.length() != 11) {
			throw new DocumentoInvalidoException();
		}
		return cpf;
	}
}
