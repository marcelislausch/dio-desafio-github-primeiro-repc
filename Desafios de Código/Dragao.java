// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  
/*Desafio
Daenerys � a khaleesi dos Dothraki. Juntamente com Drogon, eles v�o atr�s do Tyrion, para tentar dominar Westeros. Ela possui, al�m do seu drag�ozinho, um rastreador que mede o n�vel de energia de qualquer ser vivo. Todos os seres com o n�vel menor ou igual a 8000, ela considera como se fosse um inseto. Quando passa deste valor, que foi o caso do Drogon, ela se espanta e grita �Mais de 8000�. Baseado nisso, utilize a mesma tecnologia e analise o n�vel de energia dos seres vivos.

Entrada
A primeira linha cont�m um n�mero inteiro C relativo ao n�mero de casos de teste. Em seguida, haver� C linhas, com um n�mero inteiro N (100 <= N <= 100000) relativo ao n�vel de energia de um ser vivo.

Sa�da
Para cada valor lido, imprima o texto correspondente.*/
import java.util.*;
public class Solution{ 
    
   public static void main(String[] args){
            int casos, poderDeLuta;
    
            Scanner ler = new Scanner(System.in);
    
            casos = ler.nextInt();
    
            for(int i = 0; i < casos; i++){
                poderDeLuta = ler.nextInt();

//TODO: Implemente a condi��o adequada para a impress�o dos textos conforme o solicitado no desafio:
    
                //if (poderDeLuta >= 100 && poderDeLuta <= 100000) {
                    if (poderDeLuta <= 8000) {
                        System.out.println("Inseto!");
                    } else {
                        System.out.println("Mais de 8000!");
                    }
                //}   
            }
    }
}