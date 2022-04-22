package exercicios;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroBase = 8;
		
		Scanner leitor = new Scanner(System.in);
		
		String parar = "N";
		int indice = 0;
		do{
			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
			System.out.print("Deseja parar? (S/N) ");
			parar = leitor.nextLine().toUpperCase();
			indice++;
			
		}while (!parar.equals("S"));
		
			leitor.close();
	}
		
	}


