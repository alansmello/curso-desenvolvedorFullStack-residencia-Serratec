package br.com.serratec.interfaces;

public interface Registro {
	default void registrarSaida() {
		System.out.println("Saída registrada do usuário");
	}
}
