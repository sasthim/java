/*
    2)  Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de
        códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
            1,2,3,4 = voto para os respectivos candidatos;
            5 = voto nulo;
            6 = voto em branco;
        Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
            - total de votos para cada candidato;
            - total de votos nulos;
            - total de votos em branco;
        Como finalizador do conjunto de votos, tem-se o valor 0.
 */

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int[] votos = { 0, 0, 0, 0, 0, 0 };
        int input;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("[1] Candidato 1");
            System.out.println("[2] Candidato 2");
            System.out.println("[3] Candidato 3");
            System.out.println("[4] Candidato 4");
            System.out.println("[5] Nulo");
            System.out.println("[6] Branco");
            System.out.println("[0] Sair");

            input = scan.nextInt();

            if (input >= 0 && input <= 6) 
            {
                if (input == 0)
                    break;
                else
                    votos[input - 1]++;
            }
            else
                System.out.println("Valor invalido, tente novamente.");
        } while (true);
        
        for (int i=0; i<6; i++)
            System.out.println("Candidato ["+(i+1)+"]"+"= "+votos[i]+" votos.");
    
        scan.close();
    }
}
