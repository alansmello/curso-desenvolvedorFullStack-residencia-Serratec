package br.com.serratec.entidade;

public  enum TipoServicos {
	TROCA_OLEO(100) ,
	LAVAGEM (50) ,
	REVISAO(200);
	
	private double valorPorServico;
	
	TipoServicos(double servico){
		valorPorServico = servico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}
	
	
	
}

	
	
	

