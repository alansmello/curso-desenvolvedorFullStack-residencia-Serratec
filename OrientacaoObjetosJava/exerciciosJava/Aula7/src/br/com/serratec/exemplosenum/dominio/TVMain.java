package br.com.serratec.exemplosenum.dominio;

import java.util.Scanner;

import br.com.serratec.exemplosenum.entidade.MarcasTV;
import br.com.serratec.exemplosenum.entidade.TV;

public class TVMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o modelo:");
		String nomeModelo = entrada.nextLine();
		
		System.out.print("Insira a marca da TV: ");
		String nomeMarca = entrada.nextLine();
		
		
		TV tv1 = new TV(42, nomeModelo, nomeMarca );
		
		System.out.println(tv1);

	}

}
