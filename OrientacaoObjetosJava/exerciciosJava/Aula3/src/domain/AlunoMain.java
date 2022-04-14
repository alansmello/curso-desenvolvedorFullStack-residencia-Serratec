package domain;

import entities.Aluno;

public class AlunoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno alan = new Aluno();
		alan.codAluno = 1;
		alan.nome = "Alan Mello";
		alan.telefone = "24992728309";
		alan.endereco = "Rua Bataillard, lote 16, Bairro Mosela, Petrópolis - RJ";
		alan.nota1 = 9.5;
		alan.nota2 = 8.7;
		System.out.println("Média do " + alan.nome + ": " + alan.calcularNota());
		alan.imprimir();
		System.out.println(alan);
		
	}

}
