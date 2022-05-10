package br.com.serratec;

import java.io.File;
import java.util.Scanner;

public class TesteLeitura {

	public static void main(String[] args) {
		File arquivo = new File("arquivoEscrita.txt");
		
		try {
			Scanner leitorArquivos = new Scanner(arquivo);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
