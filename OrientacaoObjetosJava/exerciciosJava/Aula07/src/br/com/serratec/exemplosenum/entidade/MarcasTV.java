package br.com.serratec.exemplosenum.entidade;

public enum MarcasTV {
	OUTRO (0, "Outros"),
	SAMSUNG (1, "Samsung"), 
	LG (2, "LG"), 
	PHILCO (3, "Philco"), 
	SEMP_TOSHIBA (4, "Semp Thoshiba"),
	CCE(15, "CCE");
	
	private int codigoMarca;
	private String nomeMarca;
	
	MarcasTV(int codigoMarca, String nomeMarca) {
		this.codigoMarca = codigoMarca;
		this.nomeMarca = nomeMarca;
	}
	public static MarcasTV getMarcasByNomeMarca(String nomeMarca) {
		MarcasTV[] vetorMarcas = MarcasTV.values();
		
		
		for(MarcasTV marcaAtual : vetorMarcas) {
			
			String nomeMarcaMinusculo =  marcaAtual.getNomeMarca().toLowerCase();
			if(nomeMarcaMinusculo.equals(nomeMarca)) {
				return marcaAtual;
			}
		}
		return MarcasTV.OUTRO;
	}
	
	public int getCodigoMarca() {
		return codigoMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}
	
	
	
}

