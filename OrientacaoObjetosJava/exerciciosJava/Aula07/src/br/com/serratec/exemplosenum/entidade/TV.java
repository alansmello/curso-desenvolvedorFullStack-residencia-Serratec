package br.com.serratec.exemplosenum.entidade;

public class TV {
	private double polegadas;
	private String modelo;
	public MarcasTV marcas;
	
	public TV(double polegadas, String modelo, String marcas) {
		this.polegadas = polegadas;
		this.modelo = modelo;
		this.marcas = MarcasTV.getMarcasByNomeMarca(marcas);
	}
	

	@Override
	public String toString() {
		return "TV [polegadas=" + polegadas + ", modelo=" + modelo + ", marcas=" + marcas + "]";
	}


	public double getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public MarcasTV getMarcas() {
		return marcas;
	}

	public void setMarcas(MarcasTV marcas) {
		this.marcas = marcas;
	}
	
	
}
