package br.com.serratec.exemplosfinal.entidade;

import java.time.LocalDate;

public final class PolicialFederal extends Policial{
	
	private String unidade;
	
	public PolicialFederal(String nome, String registro, String unidade) {
		super(nome, registro);
		this.unidade = unidade;
	}
	/*
	 * não poder ser sobrescrito pois o método na classe Policial é 'final' e métodos 'final' não podem ser sobrescritos.
	@override
	public void registrarPrisao(String suspeito) {
		System.out.println("O policial " + this.nome + " registrou a prisão de " + suspeito + " .");
	}
	*/
	
	//nesse caso é permitido porque tem parâmetros diferentes.
	public void registrarPrisao(String suspeito, LocalDate data) {
		System.out.println("O policial " + this.nome + " registrou a prisão de " + suspeito + "em " + data +" .");
	}
	
	
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	

	
}
