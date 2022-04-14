package exercicios;

public class SaqueDeposito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta alan = new Conta();
		alan.titular = "Alan de Souza Mello";
		alan.numero = 0242;
		alan.saldo = 1000;
		
		alan.deposito(500);
		alan.saque(200);
		System.out.println(alan.saldo); 
		
		

	}

}
