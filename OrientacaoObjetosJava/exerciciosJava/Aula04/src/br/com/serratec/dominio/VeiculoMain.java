package br.com.serratec.dominio;

import br.com.serratec.entidade.Caminhao;
import br.com.serratec.entidade.CarroPasseio;

public class VeiculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caminhao caminhao1 = new Caminhao("KWG4A71");
		
		System.out.println(caminhao1.getPlaca());
		
		CarroPasseio carro1 = new CarroPasseio("KOL4411");
		carro1.setCor("PRATA");
		System.out.println(carro1.getCor());
		
		caminhao1.acelerar();
		carro1.acelerar();

	}

}
