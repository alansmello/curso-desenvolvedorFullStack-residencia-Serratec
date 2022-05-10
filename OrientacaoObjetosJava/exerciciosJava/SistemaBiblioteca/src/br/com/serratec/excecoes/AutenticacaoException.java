package br.com.serratec.excecoes;

public class AutenticacaoException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Credenciais incorretas";
	}

}
