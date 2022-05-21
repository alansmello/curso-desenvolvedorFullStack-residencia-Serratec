var prompt = require('prompt');
//Exibe o texto no console
//console.log("Residência - 2022");
//Exibe o texto  no Browser
//document.write("Residência - 2022");
//var nome = prompt("Digite o nome:");
//console.log(nome);

/*var vetor= new Array(10);

for(let count=0; count < vetor.length; count ++){
    vetor[count] = count * 2;
   // document.write(count + "<br>");
   console.log(vetor[count]);
}*/

var nomes = [];
//Insere um elemento no final
nomes.push("Ana");
nomes.push("Carolina");
nomes.push("Gabriel");

//Insere um elemento no inicio
//nomes.unshift("Maria");

//remove o último elemento do vetor
//nomes.pop();

//remove o primeiro elemento
//nomes.shift();

//Escolhe qual remover
//nomes.splice(1,1);

//Saber a posição do elemento no vetor
console.log(nomes.indexOf("Gabriel"));

//Ordem crescente somente o sort e descrescente usar sort e reverse
nomes.sort;
nomes.reverse

for (let count = 0; count < nomes.length; count++) {
    console.log(nomes[count]);
}
var num1= [1, 5, 8, 10, 50, 60];
var numeros;
//recebe todos os elementos de um vetor e atribui a variável numeros separado pelo delimitador
numeros = num1.join("|");

var num2 = [100, 200, 300];
var num4 = [1000, 2000];
//Concat faz a junção de vários vetores
var num3 = num1.concat(num2).concat(num4);

for (let i = 0; i < num3.length; i++) {

    console.log(num3[i]); 
}