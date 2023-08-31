/*
 *  3)  Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe.
        O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o
        código for igual a zero.
 */

import java.util.Scanner;

public class exercicio3
{
    public static void imprimiAlunos(int[] codigo, double[] media, int tamanho)
    {
        for(int i=0; i<tamanho;i++)
        {
            System.out.println("----------------------");
            System.out.println("Aluno "+(i+1));
            System.out.println("Codigo "+codigo[i]);
            System.out.println("Media: "+media[i]);
        }
        System.out.println("----------------------");
    }
    public static void main (String[] args)
    {
        int maximoAlunos = 100;
        int[] codigo = new int[maximoAlunos];       //  Queria evitar o uso de memoria desnecessária, pensei em alocação dinamica mas nao é tao simples em java 
        double[] media = new double[maximoAlunos];
        int i = 0, input, tempNota;
        Scanner scan = new Scanner(System.in);
        do {
            input = 0;
            tempNota = 0;

            System.out.println("Insira o codigo do aluno (0 para terminar):");
            input = scan.nextInt();

            if (input == 0)
                break;
            else
            {
                codigo[i] = input;
                System.out.println("Insira a primeira nota: ");
                tempNota += scan.nextInt();
                System.out.println("Insira a segunda nota: ");
                tempNota += scan.nextInt();
                System.out.println("Insira a terceira nota: ");
                tempNota += scan.nextInt();
                media[i] = tempNota/3;
            }
            i++;
        } while (true);

        scan.close();
        imprimiAlunos(codigo, media, i);
    }
}