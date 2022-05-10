package br.com.serratec.exemploexcecoes;

import java.io.FileReader;

public class TesteMain {

	public static void main(String[] args) {
		//Exceção unchecked - Verificada em tempo de Execução
		int a = 2 / 0;
		
		//Exceção checked - Verificada em tempo de Compilação.
		FileReader leitor = new FileReader("texto.txt");
	}

}
