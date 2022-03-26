programa
{
	
	funcao inicio()
	{
		inteiro a=20, b=10, resultado
		resultado = soma(a,b)
		escreva(resultado)
		//Fazendo direto a chamada da função dentro do escreva
		escreva("\n", soma(a,b), "\n")
		
		escreva(mensagem())
	}
	funcao inteiro soma(inteiro a, inteiro b){
		retorne a + b
	}
	funcao cadeia mensagem(){
		retorne "Teste"
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {resultado, 6, 22, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */