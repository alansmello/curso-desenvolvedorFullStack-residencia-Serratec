programa
{
	
	funcao inicio()
	{
		//Fazer um programa somar dois números e calcula a media em uma função
		real numero1, numero2, resultado
		escreva("Numero 1:")
		leia(numero1)
		escreva("Numero 2:")
		leia(numero2)

		resultado = calculaMedia(numero1, numero2)
		escreva(resultado)
	}

	funcao real calculaMedia(real &n1, real &n2){
		retorne (n1+n2)/2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */