// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*
Desafio
Leia 3 valores reais (A, B e C) e verifique se eles formam ou n�o um tri�ngulo. Em caso positivo, calcule o per�metro do tri�ngulo (soma de todos os lados) e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura, mostrando a mensagem:

Area = XX.X

F�rmula da �rea de um trap�zio: AREA = ((A + B) x C) / 2

Entrada
A entrada cont�m tr�s valores reais.

Sa�da
O resultado deve ser apresentado com uma casa decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double area;
		double soma;
		
		if ((A < B + C) && (B < A + C) && (C < A + B)) {
            soma = A + B + C;
            System.out.println("Perimetro = " + String.format("%.1f", soma));
        } else {
            area = ((A + B) * C) / 2;
            System.out.println("Area = " + String.format("%.1f", area));
        }
		
//TODO: Implemente a condi��o necess�ria para o c�lculo do tri�ngulo:
//Dica: Voc� pode utilizar o String.format() na formata��o do texto.
		
		
	}
	
}