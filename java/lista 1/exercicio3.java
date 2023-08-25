/*3) Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe.
O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o
código for igual a zero.

pedir o codigo do aluno
-caso 0 -> encerrar
-else -> pede as 3 notas e calcula media
*/

import java.util.Scanner;

public class exercicio1
{
    public static void imprimiAlunos(int[] codigo, double[] media)
    {
        for(int i=0; i<codigo.lenght;i++)
        {
            System.out.println("----------------------");
            System.out.println("Aluno "+i);
            System.out.println("Codigo "+codigo[i]);
            System.out.println("Media: "+media[i]);
        }
        System.out.println("----------------------");
    }
    public static void main (String[] args)
    {
        int input;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Insira o codigo do aluno (0 para terminar):");
            input = scan.nextInt();
            if (input == 0)
                break;
            else
            {
                
            }
        } while (input >= 0);
        scan.close();
        imprimiAlunos();
    }
}