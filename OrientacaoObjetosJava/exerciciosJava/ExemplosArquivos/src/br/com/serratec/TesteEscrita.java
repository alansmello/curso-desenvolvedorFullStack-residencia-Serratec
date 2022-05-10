package br.com.serratec;

import java.io.File;
import java.io.IOException;

public class TesteEscrita {


			public static void main(String[] args) {
				// criando uma conexão com o arquivo
				File arquivo = new File("arquivo3.txt");
				
				//verifica se o arquivo existe
				boolean arquivoExiste = arquivo.exists();
				
				if(!arquivoExiste) {
					try {
						arquivo.createNewFile();
						System.out.println("Arquivo criado com sucesso");
					}catch (IOException e ){
						System.out.println("Problemas de permissão na pasta.Finalizando o programa");
						
					}
				}
				
				
				
			}

		}

	


