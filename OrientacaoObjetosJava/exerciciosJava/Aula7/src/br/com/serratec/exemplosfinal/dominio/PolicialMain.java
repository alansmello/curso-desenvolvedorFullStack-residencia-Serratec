package br.com.serratec.exemplosfinal.dominio;

import br.com.serratec.exemplosfinal.entidade.Policial;
import br.com.serratec.exemplosfinal.entidade.PolicialFederal;

public class PolicialMain {

	public static void main(String[] args) {
		
		Policial p1 = new Policial("Alan Mello", "1713007");
		PolicialFederal pf1 = new PolicialFederal("Cauã Mello", "1713003", "COPE");
		
		final String NOME_SUSPEITO = "Zé Vacilão"; // constante
		final int IDADE_SUSPEITO;
		IDADE_SUSPEITO = 45;
		
		System.out.println("Número máximo de armas: " + p1.NUMERO_MAXIMO_ARMAS );
		
	}

}
