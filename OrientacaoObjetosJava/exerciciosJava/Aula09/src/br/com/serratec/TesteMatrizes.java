package br.com.serratec;

public class TesteMatrizes {
	public static void main(String[] args) {
		// 3 formas de declarar matrizes
		int[][] coordenadas1 = new int[4][3];
		int[][] coordenadas2 = new int[][] {{2,1},
									  	    {4,5},
									        {3,9}};
		int[][] coordenadas3 = {{7,11},
		  	                  {77,5},
		                      {31,92}};
		
		for(int i = 0; i<coordenadas2.length;i++) {
			for(int j =0; j<coordenadas2[i].length; j++){
				System.out.println(coordenadas2[i][j]);
			}
		}
		
		System.out.println("===================================");
		//for each
		for (int[] linhaAtual: coordenadas3) {
			for(int numeroAtual: linhaAtual) {
				System.out.print(numeroAtual + ",");
			}
				System.out.println("");
		}
		}
	}


