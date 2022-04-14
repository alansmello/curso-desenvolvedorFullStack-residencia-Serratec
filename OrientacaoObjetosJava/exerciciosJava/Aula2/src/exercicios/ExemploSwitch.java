package exercicios;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Insira a opção desejada: ");
		int opcao = leitor.nextInt();
		
		leitor.nextLine();
		System.out.print("digite seu nome: ");
		String nomeUsuario = leitor.nextLine();
		
		switch(opcao){
			case 1:
				System.out.println("Parabéns! Você selecionou o 1, " + nomeUsuario);
				break;
			case 2:
				System.out.println("Você selecionou o 2");
				break;
			default:
				System.out.println("Opção inválida. Parando o programa.");
				break;
		
		
		}
	}

}
