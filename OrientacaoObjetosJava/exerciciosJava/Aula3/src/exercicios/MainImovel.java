package exercicios;

public class MainImovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imovel i1 = new Imovel();
		Imovel i2 = new Imovel();
		
		i1.codImovel = 1;
		i1.bairro = "Centro";
		i1.tipo = "apto";
		i1.valor = 25000;
		
		i2.codImovel = 2;
		i2.bairro = "Quitandinha";
		i2.tipo = "casa";
		i2.valor = 98900;
		
		double reajuste1 = i1.calculateReadjustment();
		double reajuste2 = i2.calculateReadjustment();
		
		System.out.printf("Com o reajuste, o valor ficou em R$ %.2f\n",reajuste1);
		System.out.printf("Com o reajuste, o valor ficou em R$ %.2f\n",reajuste2);
		
		i1.showCategory();
		i2.showCategory();
	
	}

}
