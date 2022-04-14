
public class CalculadoraMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1 = 7.5;
		double nota2 = 8.1;
		double nota3 = 6;
		double nota4 = 9.2;
		double media = (nota1+nota2+nota3+nota4) / 4f;
		var nome= "Alan";
		var numero = 2.54;
		
		System.out.printf("A média é %.1f \n", media );
		System.out.println("A média é " + String.format("%.1f", media) );
		System.out.println(nome + numero );
		
		

	}

}
