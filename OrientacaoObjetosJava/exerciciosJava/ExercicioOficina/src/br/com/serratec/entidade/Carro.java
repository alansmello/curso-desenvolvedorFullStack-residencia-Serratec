package br.com.serratec.entidade;

import java.time.LocalDate;

public class Carro extends Veiculo  {
	private String categoria;

	public Carro(String modelo, LocalDate data, Proprietario proprietario, String categoria) {
		super(modelo, data, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public double lavarVeiculo() {
		return 0.0;
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
	
	
}
