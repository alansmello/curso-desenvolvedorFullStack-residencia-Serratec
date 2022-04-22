package br.com.serratec.entidade;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo  {
	private String categoria;

	public Carro(String modelo, LocalDate data, Proprietario proprietario, String categoria) {
		super(modelo, data, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public double lavarVeiculo() {
		return valorCobrado += TipoServicos.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		if(dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorCobrado += TipoServicos.TROCA_OLEO.getValorPorServico() - 50;
			return valorCobrado;
		}
		
		
		return valorCobrado += TipoServicos.TROCA_OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		if(dataConserto.getMonth().equals(Month.AUGUST)) {
			return valorCobrado += TipoServicos.REVISAO.getValorPorServico() - (TipoServicos.REVISAO.getValorPorServico()*0.1);
		}
		
			return valorCobrado += TipoServicos.REVISAO.getValorPorServico();
	
	}
}
