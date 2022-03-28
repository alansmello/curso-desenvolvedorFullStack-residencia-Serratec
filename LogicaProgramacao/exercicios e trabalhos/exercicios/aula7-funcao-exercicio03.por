programa
{
/*
	Faça um programa que leia duas notas
	Crie uma função para calcular a média
	Criar uma funcao para verificar a situação se a media >=7 Aprovado
 */
	funcao inicio()
	{
		real nota1, nota2, media

		escreva("Digite a nota 01:\n")
		leia(nota1)
		
		escreva("\nDigite a nota 02:\n")
		leia(nota2)
		
		media = calcularMedia(nota1, nota2)
		escreva("\nSua média é ", media, "\n")

		se(situacaoAluno(media)){
			escreva("\nAPROVADO\n")
		}senao{
			escreva("\nREPROVADO\n")
		}
		
		
	}

	funcao real calcularMedia(real nota1, real nota2){
		retorne (nota1+nota2)/2
	}

	funcao logico situacaoAluno(real media){
		se (media >= 7){
			retorne verdadeiro
		}senao{
			retorne falso
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */