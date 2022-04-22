package br.com.serratec.entidade;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate data, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = data;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return proprietario + "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto + "]";
	}

	public double getValorCobrado() {
		return valorCobrado;
	}
	
	
}
