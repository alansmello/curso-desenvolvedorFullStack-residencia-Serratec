programa
{
	
	funcao inicio()
	{
		cadeia nome
		real salario
		escreva("Nome:")
		leia(nome)
		escreva("Salário:")
		leia (salario)
		aumentoSalarial(salario)
		escreva("Novo salário:", salario)
	}

	funcao  aumentoSalarial(real &s){
		 s = s * 1.15
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {salario, 7, 7, 7}-{s, 16, 31, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */