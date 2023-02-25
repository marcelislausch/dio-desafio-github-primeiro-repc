// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*
Desafio
Seu Z� est� vendendo frutas com a seguinte tabela de pre�os:

Exemplo 1

 	    At� 5 Kg	     Acima de 5 Kg
Morango	R$ 2,50 por Kg	R$ 2,20 por Kg
Ma��	R$ 1,80 por Kg	R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receber� ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de ma�as adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, voc� recebera a quantidade em kg de morangos e a quantidade em kg de ma��s.

Sa�da
Ser� o valor a ser pago pelo cliente, conforme a tabela de pre�os da quintanda do seu Z�.
*/
import java.util.*;

public class DIO {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       double saida = 0.0;
//TODO: Implemente as condi��es necess�rias para retornar o pre�o a ser pago pelo cliente, conforme a tabela de pre�os do seu Z�:
        
        if (morangos > 5) {
            saida += 2.20 * morangos;
        } else {
            saida += 2.50 * morangos;
        }
        if (macas > 5) {
            saida += 1.50 * macas;
        } else {
            saida += 1.80 * macas;
        }

        if (saida > 25.0 || (morangos + macas) > 8) {
            saida = saida - (saida * 0.1);
        }
        System.out.println(saida);
    }
}