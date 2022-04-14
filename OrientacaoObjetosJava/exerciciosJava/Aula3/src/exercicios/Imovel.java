package exercicios;

public class Imovel {
	public int codImovel;
	public String bairro;
	public String tipo;
	public double valor;
	
	public double calculateReadjustment() {
		
		if(this.tipo == "casa") {
			return this.valor * 1.05;
		}else {
			return this.valor * 1.08;
		}
		}
	
	public void showCategory() {
		if(this.valor > 50000) {
			System.out.println("Categoria A");
		}else if(this.valor >= 10000 && this.valor <= 50000) {
			System.out.println("Categoria B");
		}else {
			System.out.println("Categoria C");
		}
	}
}