package entities;

public class Aluno {

		public int codAluno; //recebe por padrão o 0
		public String nome; //recebe por padrão o ""
		public String telefone;
		public String endereco;
		public double nota1;
		public double nota2;
		public boolean matriculaAtiva;//recebe por padrão o false
		
		public double calcularNota() {
			return (this.nota1 + this.nota2) / 2;
		}
		
		public void imprimir() {
			System.out.println("Codigo aluno: " + this.codAluno + "\nNome: " + this.nome);
		}
		
}
