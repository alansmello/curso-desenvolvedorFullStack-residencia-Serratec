package br.com.serratec.dominio;

import java.time.LocalDate;

import br.com.serratec.entidade.Carro;
import br.com.serratec.entidade.Proprietario;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario alan = new Proprietario("Alan Mello");
		Carro c1 = new Carro("Tucson", LocalDate.now(),alan,"SUV" );
		
		c1.trocarOleo();
		c1.revisao();
		System.out.println(c1);
		
		

	}

}
