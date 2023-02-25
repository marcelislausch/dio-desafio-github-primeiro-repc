// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.  

/*
Desafio
Jorginho � professor do prim�rio de uma determinada escola. Ele tem 100000 alunos e precisa criar um programa que verifica quantos espa�os em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avalia��o final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!

Entrada
A entrada ser� uma frase no formato de string. 

Sa�da
A sa�da dever� retornar quantos espa�os em branco e quantas vogais existem na determinada string, conforme exemplo abaixo:
*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     String[] strSplit = str.split(" ");
     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
    
    for (String item : strSplit) {
        for (int i = 0; i < item.length(); i++) {
            char c = item.toLowerCase().charAt(i);
            for (char arrVogai : arrVogais) {
                if (arrVogai == c) {
                    quantVogais++;
                }
            }
        }
   //TODO: Implemente condi��es (la�os) adequados para que possamos contar os espa�os em brancos e as vogais que existem na string.
  //Dica: Voc� pode utilizar o Character.toLowerCase em sua condi��o:
        
    }
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
}
}