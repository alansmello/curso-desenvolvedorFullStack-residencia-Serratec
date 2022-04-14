package exercicios;

public class Conta {
	public String titular;
	public double numero;
	public double saldo;
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Deposito de R$" + valor + " realizado com sucesso.\nTotal atualizado: R$" + (saldo));
	}
	
	public boolean saque(double valor) {
		if(valor <= saldo) {
		this.saldo = saldo - valor;
		return true;
	}else {
		return false;
	}
}
}
