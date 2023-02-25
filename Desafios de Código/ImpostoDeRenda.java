// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*
Desafio
H� um pa�s denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Loli, cujo s�mbolo � o R$.

Voc� ter� o desafio de ler um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.

Sa�da
Imprima o texto "R$" seguido de um espa�o e do valor total devido de Imposto de Renda, com duas casas ap�s o ponto. Se o valor de entrada for menor ou igual a 2000, dever� ser impressa a mensagem "Isento".
*/
import java.io.IOException;
import java.util.Scanner;

public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0.0;
        double resto = 0.0;

        if (renda > 4500.0) {
            resto = renda - 4500.0;
            imposto += resto * 0.28;
            renda = renda - resto;
        }
        if (renda > 3000.0 && renda <= 4500.0) {
            resto = renda - 3000.0;
            imposto += resto * 0.18;
            renda = renda - resto;
        }
        if (renda > 2000.0 && renda <= 3000.0) {
            resto = renda - 2000.0;
            imposto += resto * 0.08;
        }
        System.out.println(imposto > 0.0 ? "R$ " + String.format("%.2f", imposto) : "Isento");
    }
}