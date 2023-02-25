// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*Desafio
Neste desafio, fa�a um programa que calcule o valor de H com N termos. 

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

Entrada 
A entrada consiste em um n�mero inteiro positivo. 

Sa�da 
Na sa�da ser� impresso o valor que representa a soma dos termos.*/
import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
           h = h + (double)1/i;
      }
     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
      System.out.println(String.format("%.0f", h));
   }
}