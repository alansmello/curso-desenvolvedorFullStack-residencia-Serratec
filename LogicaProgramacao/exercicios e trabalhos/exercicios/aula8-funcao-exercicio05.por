programa
{	
	//Numeros para Mega-Sena
	inclua biblioteca Util --> u
	inteiro vetor[10]
	
	funcao inicio()
	{
		preencheVetor()
	}

	funcao preencheVetor(){
		para(inteiro i =0; i<6;i++){
			vetor[i] = u.sorteia(0,60)
			escreva(vetor[i]," ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */