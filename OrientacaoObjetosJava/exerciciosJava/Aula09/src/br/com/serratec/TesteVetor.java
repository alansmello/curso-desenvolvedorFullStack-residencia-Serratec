package br.com.serratec;

public class TesteVetor {
	
	public static void main(String[] args) {
		
	
	// 3 formas de declarar vetores
	final int QTD_NOTAS = 4;
	
	int[] notas1 = new int[QTD_NOTAS];
	int[] notas2 = new int[] {10, -4, 700, 546};
	int[] notas3 = {8, 6, 9, 3} ;
	
	//Percorrendo um vetor
	
	for(int i=0; i <notas2.length; i++) {
		System.out.println("Notas do " + (i+1) + "º bimestre: " + notas2[i] );
	}
	//for each
	int i = 1;	
	for(int notaAtual: notas3) {
	System.out.println(i + "º bimestre: " + notaAtual);
	i++;
	}
}
}