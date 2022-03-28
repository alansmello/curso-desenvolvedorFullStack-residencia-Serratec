programa
{	
inclua biblioteca Matematica --> mat
inclua biblioteca Texto --> t
	
	funcao inicio()
	{
		real base, expoente, resultado

		escreva ("Base:")
		leia(base)
		escreva("Expoente:")
		leia(expoente)
		resultado = mat.potencia(base,expoente)	
		escreva("O resultado é:", resultado,"\n")	
		escreva(mat.maior_numero(200,2000))
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */