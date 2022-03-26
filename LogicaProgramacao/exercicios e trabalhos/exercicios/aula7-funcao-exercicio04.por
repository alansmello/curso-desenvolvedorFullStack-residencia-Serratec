programa
{
	/*
	Leitura da idade na função inicio
	Criar uma funcao para calcular a seguinte informação:
		idade >= 18 e idade <=40
			Jogador Profissional
		idade < 18 
			Jogador Categoria de base
		senao
			Jogador Master
*/
	funcao inicio()
	{
		inteiro idade
		escreva("Digite sua idade:\n")
		leia(idade)
		escreva(categoriaJogador(idade))
	}
	funcao cadeia categoriaJogador(inteiro idade){
			se(idade>=18 e idade <= 40){
				retorne "Jogador Profissional"
			}se (idade < 18){
				retorne "Jogador Categoria de Base"
			}senao{
				retorne "Jogador Master"
			}
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */