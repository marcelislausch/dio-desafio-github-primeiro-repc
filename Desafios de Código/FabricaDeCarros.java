// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*
Desafio
O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). O gerente de uma loja de carros gostaria de um programa para calcular o pre�o de um carro novo para os clientes. Voc� receber� o custo de f�brica e as porcentagens referentes ao distribuidor e os impostos e dever� escrever programa para ler esses valores e imprimir o valor final do carro.

Entrada
Voc� recebera tr�s valores inteiros que representam o custo de f�brica, as porcentagens do distribuidor e os impostos.

Sa�da
Como sa�da, teremos o valor final do pre�o de um carro novo.
*/
import java.util.*;

public class Main{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
      int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();

            int custoConsumidor;
     
            int Distribuidor;
            int ValorImpostos;
 
        // TODO: Implemente uma condi��o que calcule a porcentagem do distribuidor e dos impostos:
 
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
        System.out.println(custoConsumidor);
	}
}