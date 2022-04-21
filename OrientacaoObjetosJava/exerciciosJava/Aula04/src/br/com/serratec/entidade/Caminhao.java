package br.com.serratec.entidade;

public class Caminhao extends Veiculo {
	
	public Caminhao(String placa) {
		super(placa);
	}
	
	private int cargaMaxima;

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
}
