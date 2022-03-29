programa
{
	
	funcao inicio()
	{	
		inteiro numero
		escreva("Digite um numero:")
		leia(numero)
		escreva("Resultados: ", somarNumerosAnteriores(numero)) 
	}

		funcao inteiro somarNumerosAnteriores(inteiro numero){
			inteiro resultado
			se(numero <= 1){
				retorne 1
			}senao{
				
				resultado = somarNumerosAnteriores(numero -1) * numero
				retorne resultado
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */