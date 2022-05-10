package br.com.serratec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		/**
		 * Vantagens de List:
		 * tem tamanho variado;
		 * permite eventos duplicados;
		 * permite tipos() diferentes dentro da mesma lista.
		 */
		
		List minhaLista = new ArrayList();
		
		//add -> adiciona um item no fim da lista.
		//não é legal fazer os exemplos abaixo, ideal seguir uma linha de Herança um compartilhamento em comum.
		minhaLista.add("isso é uma String");
		minhaLista.add(42);
		minhaLista.add(44.5);
		minhaLista.add(new Scanner(System.in));
		
	
		
		List cpfsCadastrados = new ArrayList<String>();
		
		cpfsCadastrados.add("09139100740");
		cpfsCadastrados.add("08169100739");
		cpfsCadastrados.add("06842745748");
		cpfsCadastrados.add("08169100739");
		
		System.out.println(cpfsCadastrados);
		
		cpfsCadastrados.remove(2);
		System.out.println(cpfsCadastrados);
		
		cpfsCadastrados.remove("08169100739");
		System.out.println(cpfsCadastrados);
		
		cpfsCadastrados.add(1,"06842745748");
		System.out.println(cpfsCadastrados);
		
		Collections.sort(cpfsCadastrados);
		System.out.println(cpfsCadastrados);
	
		System.out.println(7/0);
	}

}
