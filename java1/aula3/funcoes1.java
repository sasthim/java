package java1.aula3;

import java.util.Scanner;

public class funcoes1
{
    public static double calculadora (double x, double y, char operador)
    {
        double resultado = 0;
        switch(operador)
        {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = x / y;
                break;
            default:
                System.out.println("Erro");
        }
        return resultado;
    }

    public static String isPair (int x)
    {
        String resultado;
        if (x%2 == 0)
            resultado = "Par";
        else
            resultado = "Impar";
        return resultado;
    }

    public static int contadorChar (String frase, char c)
    {
        int resultado = 0;

        for (int i = 0; i < frase.length(); i++)
        {
            if (frase.charAt(i) == c)
                resultado++;
        }
        return resultado;
    }

    public static double conversaoTemp (double x, char c)
    {
        double resultado = 0;

        if (c == 'c')
        resultado = (9 * x)/5 + 32;
        else if (c == 'f')
        resultado = (x - 32) * 5 / 9;

        return resultado;
    }

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double x, y; 
        int z, opcao;
        char caractere;
        String frase;
        
        System.out.println("O que voce deseja fazer?");
        System.out.println("[1] Calculadora simples");
        System.out.println("[2] Verificacao de numero par");
        System.out.println("[3] Contagem de caracteres");
        System.out.println("[4] Conversao de temperatura");

        opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao)
        {
            case 1:
                System.out.println("Digite o primeiro digito:");
                x = scan.nextDouble();
                System.out.println("Digite o segundo digito:");
                y = scan.nextDouble();
                System.out.println("Digite a operacao(+, -, *, /):");
                caractere = scan.next().charAt(0);
                System.out.println("Resultado: " + calculadora(x, y, caractere));
                break;

            case 2:
                System.out.println("Digite o numero a ser vericado:");
                z = scan.nextInt();
                scan.nextLine();
                System.out.println("Resultado: " + isPair(z));
                break;

            case 3:
                System.out.println("Digite a frase(string):");
                scan.nextLine();
                frase = scan.nextLine();
                System.out.println("Digite o caracter a ser contado: ");
                caractere = scan.next().charAt(0);
                System.out.println("Resultado: " + contadorChar(frase, caractere));
                break;

            case 4:
                System.out.println("[1] Celsius para Fahrenheint");
                System.out.println("[2] Fahrenheint para celsius");
                opcao = scan.nextInt();
                
                if(opcao == 1)
                {
                    caractere = 'c';
                    System.out.println("Digite a temperatura em graus celsius: ");
                    x = scan.nextDouble();
                    System.out.println("Resultado: " + conversaoTemp(x, caractere) + " F");
                }
                else if (opcao == 2)
                {
                    caractere = 'f';
                    System.out.println("Digite a temperatura em fahrenheint: ");
                    x = scan.nextDouble();
                    System.out.println("Resultado: " + conversaoTemp(x, caractere) + " C");
                }
        }
        scan.close();
    }
}