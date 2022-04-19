
public class TestaMedico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medico m1 = new Medico("12345", "Ana Maria", 250.00);
		Medico m2 = new Medico("456789", "Antônio", 300.00);
		
		m1.pagamentoDinheiro();
		m1.pagamentoPlano();
		m2.pagamentoPlano();
		m2.pagamentoPlano();
		m1.exibirDados();
		m2.exibirDados();
		System.out.println("Total de Médicos: " + Medico.getNumeroMedico());
	
	}

}
