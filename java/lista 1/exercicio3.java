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
        int[] codigo;
        int[] media;
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
                media[i] = tempNota/3
            }
            i++;
        } while (true);

        scan.close();
        imprimiAlunos();
    }
}