package br.com.serratec.entidade;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, LocalDate data, Proprietario proprietario, int cilindradas) {
		super(modelo, data, proprietario);
		this.cilindradas = cilindradas;
		
	}
	
	public double lavarVeiculo() {
		return TipoServicos.LAVAGEM.getValorPorServico();
	}
	
	public double trocarOleo() {
		return TipoServicos.TROCA_OLEO.getValorPorServico();
	}
	
	public double revisao() {
		return TipoServicos.REVISAO.getValorPorServico();
	}
	
	
}
