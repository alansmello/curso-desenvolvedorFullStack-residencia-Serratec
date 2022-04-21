package br.com.serratec.entidade;

public class CarroPasseio extends Veiculo {
	private int qtdPortas;
	
	public CarroPasseio(String placa) {
		super(placa);
	}
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	@Override // Sobrescrever
	public void acelerar() {
		System.out.println("aumentou a velocidade em 10KM");
	}

}
