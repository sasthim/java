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
            if (input >= 0 && input <= 6) {
                if (input == 0)
                    break;

                else
                    votos[input - 1]++;
            } else
                System.out.println("Valor invalido, tente novamente.");
        } while (true);
        for (int i=0; i<6; i++)
            System.out.println("Candidato ["+(i+1)+"]"+"= "+votos[i]+" votos.");
        scan.close();
    }
}
