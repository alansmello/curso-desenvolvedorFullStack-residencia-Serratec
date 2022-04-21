package br.com.serratec.exemplosfinal.entidade;

public class Policial {
	public static int NUMERO_MAXIMO_ARMAS;
	protected String nome;
	protected String registro;
	
	public Policial(String nome, String registro) {
		
		this.nome = nome;
		this.registro = registro;
	}

	public final void registrarPrisao(String suspeito) {
		System.out.println("O policial " + this.nome + " registrou a prisão de " + suspeito + " .");
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	
	
}
