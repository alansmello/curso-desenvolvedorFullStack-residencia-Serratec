package br.com.serratec.manipuladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoAutoresManipulador {

		//Loader = carregador
		public static void ArquivoAutoresLoader() {
			File arquivoAutores = new File("autores.csv");
			criarArquivoSeNecessario(arquivoAutores);
			
			FileReader leitorArquivo = null;
			leitorArquivo = new FileReader(arquivoAutores);
			BufferedReader leitorArquivoBff = new BufferedReader(leitorArquivos);
			
			/**
			try {
				leitorArquivo = new FileReader(arquivoAutores);
			} catch (FileNotFoundException e) {
				System.out.println("Erro ao ler arquivos da memória.");
			}
			BufferedReader leitorArquivoBff = new BufferedReader(leitorArquivos);
			*/
			
			do {
				String autorString = leitorArquivoBff.readLine();
				String[] autorVetor = autorString.split("");
			} while (condition);
		}
		
		public static void criarArquivoSeNecessario(File arquivo) {
			if(!arquivo.exists()) {
				try {
					arquivo.createNewFile();
				} catch (IOException e) {
					System.out.println("Erro ao criar o arquivo de autores.");
					System.exit(1);
				}
			}
		}
}
