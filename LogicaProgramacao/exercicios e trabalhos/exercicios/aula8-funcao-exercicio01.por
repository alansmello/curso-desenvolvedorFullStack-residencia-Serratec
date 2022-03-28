programa
{
	
	funcao inicio(){
		
		cadeia nome
		inteiro idade
		escreva("Nome:")
		leia(nome)
		escreva("Idade:")
		leia(idade)
		imprimir(nome, idade)
		escreva("--------------\n")
		escreva(nome, "-", idade)
	
	}

	funcao imprimir(cadeia &nome, inteiro &idade){
		escreva("----Dados da inscrição----\n")
		escreva("Nome:",nome, "\n", "Idade:", idade, "\n")
		nome = "Antonio"
		idade = 50
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nome, 6, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */