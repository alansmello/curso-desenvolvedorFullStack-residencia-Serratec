programa
{
	
	funcao inicio()
	{
		inteiro matriz[10][12]
		inteiro interacaoUsuario = 1
		inteiro numeroFileira =0
		inteiro numeroPoltrona = 0
		
		para(numeroFileira; numeroFileira < 10; numeroFileira++){
			escreva("\n")
			para(numeroPoltrona=0;  numeroPoltrona < 12; numeroPoltrona++){
				matriz[numeroFileira][numeroPoltrona]=0
				
			}
		}
            	escreva("**Bem vindo ao CineGrupo-4**\n\n")

			enquanto(interacaoUsuario != 0){

				escreva("Escolha uma das opções abaixo para continuar.\n\n",
					"1 - Reservar um assento.\n",
					"2 - Consultar assentos reservados.\n",
					"0 - Finalizar o sistema.\nDigite aqui: ")
			leia(interacaoUsuario)
			escreva("\n")
				
				se(interacaoUsuario == 1){

					escreva("Numero da fileira:")
					leia(numeroFileira)
					escreva("Numero da Poltrona:")
					leia(numeroPoltrona)

					se(matriz[numeroFileira][numeroPoltrona]==1){
						escreva("Este assento já está reservado:\n\n")
					
					}senao{
						matriz[numeroFileira][numeroPoltrona]=1
						escreva("Sua reserva foi realizada com sucesso:\n\n")
					}
					
				}senao se(interacaoUsuario == 2){

					escreva("Mapa das poltronas:\n\n01 02 03 04 05 06 07 08 09 10 11 12\n")
					para(inteiro i = 0; i < 10; i++){
						escreva("\n")
						escreva(matriz[i][i])
						para(inteiro j = 0; j < 11; j++) {
							escreva("  ", matriz[(i)][(j)])
						}
					}
					escreva("\n\n\n")
					
				}senao se(interacaoUsuario == 0){
					escreva("Sistema finalizado.\n\n")
					
				}senao{
					escreva("Opção desejada é inválida.\n\n")
				}
				
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1573; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */