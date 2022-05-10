package br.com.serratec.interfaces;

import br.com.serratec.excecoes.AutenticacaoException;

public interface Autenticacao {
	public abstract void autenticar(String login) throws AutenticacaoException;
}
