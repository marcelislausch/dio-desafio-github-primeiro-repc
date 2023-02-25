// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*
DESAFIO
Neste problema, voc� dever� ler 3 palavras que definem o tipo de animal poss�vel segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, atrav�s das tr�s palavras fornecidas.
Entrada
A entrada cont�m 3 palavras, uma em cada linha, necess�rias para identificar o animal segundo a figura acima, com todas as letras min�sculas.

Sa�da
Imprima o nome do animal correspondente � entrada fornecida.
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();

		//TODO: Implemente as condi��o necess�ria para que seja verificado que tipo de animal �:
               //Dica: Voc� pode utilizar o m�todo equals para realizar compara��es.
        if (AN1.equalsIgnoreCase("vertebrado")) {
            if (AN2.equalsIgnoreCase("ave")) {
                if (AN3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (AN2.equalsIgnoreCase("mamifero")) {
                if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (AN3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (AN1.equalsIgnoreCase("invertebrado")) {
            if (AN2.equalsIgnoreCase("inseto")) {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (AN3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (AN2.equalsIgnoreCase("anelideo")) {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
	}
}