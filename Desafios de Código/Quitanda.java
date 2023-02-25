// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  
/*
Desafio
Seu Zé está vendendo frutas com a seguinte tabela de preços:

Exemplo 1

 	    Até 5 Kg	     Acima de 5 Kg
Morango	R$ 2,50 por Kg	R$ 2,20 por Kg
Maçã	R$ 1,80 por Kg	R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.

Saída
Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.
*/
import java.util.*;

public class DIO {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       double saida = 0.0;
//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        
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