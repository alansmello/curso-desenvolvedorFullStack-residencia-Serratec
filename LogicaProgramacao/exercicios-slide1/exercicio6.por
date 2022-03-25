/* 4 - Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit
 Exemplo :
 Entrada :
 Digite o valor da temperatura em Celsius : 10
 Saída :
 10 graus Celsius é o mesmo que 50 graus Fahrenheit

*/

programa
{
	
	funcao inicio () 
	{
		// Temperatura em Celsius : 10 
		// Temperatura em Fahrenheit : 1,8 + 32
		
		real Celsius, Fahrenheit,C 
		
		
          escreva (" Entre com a temperatura em Celsius: ")
          leia(Celsius)
          
          C= 1.8
          Fahrenheit=(Celsius * C) + 32
          escreva("\n A temperatura em Fahrenheit será: ", Fahrenheit)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */