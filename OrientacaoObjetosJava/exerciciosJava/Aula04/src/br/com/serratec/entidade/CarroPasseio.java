package br.com.serratec.entidade;

public class CarroPasseio extends Veiculo {
	private int qtdPortas;

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	@Override // Sobrescrever
	public void acelerar() {
		System.out.println("aumenteou a velocidade em 10KM");
	}

}
