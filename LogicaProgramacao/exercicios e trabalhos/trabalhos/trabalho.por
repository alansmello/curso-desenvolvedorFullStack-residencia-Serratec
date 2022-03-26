programa{
  /*   Criar um algoritmo para reserva de assentos em um cinema. No nosso exemplo
a sala de cinema deverá possuir dez filas com doze assentos totalizando cento e
vinte assentos.
Obs: O programa deverá funcionar até que for digitado um valor de assento
negativo.

   *    
   *    Escrito por: Alan de Souza Mello, Barbara Espenchidt, Cristovão da Rocha Machado Fiuza Marques da Silva, 
   *    Jonathan Lopes Penha, Letícia Borges Henrique Monteiro, Samir Jaber Copar.
   *    Março de 2022
   */
   
  funcao inicio(){
    
    inteiro l, c, linha, coluna, reservas = 0, sala[10][12]

    para(l = 0; l < 10; l++){
      para(c = 0; c < 12; c++){
        sala[l][c] = 0
      }
    }

    faca{
    	
      escreva("0  1  2  3  4  5  6  7  8  9 10 11\n\n")
      para(l = 0; l < 10; l++){
        para(c = 0; c < 12; c++){
          escreva(sala[l][c], "  ")
        }
        escreva("  ", l, "\n")
      }
  
      escreva("Digite linha e coluna da poltrona desejada:\n")
      leia(linha, coluna)
  
      se(linha > 9 ou coluna > 11){
        escreva("\nLinha inválida. Digite outra linha válida!\n")
      }se (linha >= 0 e coluna >=0){
      	se(sala[linha][coluna] == 1){
            escreva("\nPoltrona já reservada. Escolha outra!\n")
      	}senao{
      	
            sala[linha][coluna] = 1
            escreva("\nReserva realizada com sucesso!!!\n")
            reservas++
      	 }}
    }enquanto(linha>=0 e coluna>=0)
    
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */