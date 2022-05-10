package br.com.serratec.interfaces;

import br.com.serratec.excecoes.AutenticacaoException;

public interface AutenticacaoDiretoria extends Autenticacao {
	public abstract void autenticar(String login, String senha) throws AutenticacaoException;
}
