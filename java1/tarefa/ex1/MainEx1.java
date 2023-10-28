package java1.tarefa.ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainEx1 {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        while (true) {
            String escolha = JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                "1- Cadastrar\n" +
                "2- Mostrar todos\n" +
                "3- Animal falando\n" +
                "4- Sair"
            );

            int opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1:
                    String tipoAnimal = JOptionPane.showInputDialog(
                        "Qual animal você quer cadastrar?\n" +
                        "1- Cachorro\n" +
                        "2- Gato\n" +
                        "3- Capivara"
                    );

                    String nome = JOptionPane.showInputDialog("Informe o nome do animal:");
                    String idadeString = JOptionPane.showInputDialog("Informe a idade do animal:");
                    int idade = Integer.parseInt(idadeString);

                    switch (tipoAnimal) {
                        case "1":
                            String velocidadeString = JOptionPane.showInputDialog("Informe a velocidade do cachorro:");
                            int velocidade = Integer.parseInt(velocidadeString);
                            Cachorro cachorro = new Cachorro(nome, idade, velocidade);
                            animais.add(cachorro);
                            break;
                        case "2":
                            String alturaSaltoString = JOptionPane.showInputDialog("Informe a altura de salto do gato:");
                            int alturaSalto = Integer.parseInt(alturaSaltoString);
                            Gato gato = new Gato(nome, idade, alturaSalto);
                            animais.add(gato);
                            break;
                        case "3":
                            String pesoString = JOptionPane.showInputDialog("Informe o peso da capivara:");
                            int peso = Integer.parseInt(pesoString);
                            Capivara capivara = new Capivara(nome, idade, peso);
                            animais.add(capivara);
                            break;
                    }
                    break;
                case 2:
                    StringBuilder output = new StringBuilder();
                    for (Animal animal : animais) {
                        output.append(animal.imprimir()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, output.toString());
                    break;
                case 3:
                    StringBuilder sounds = new StringBuilder();
                    for (Animal animal : animais) {
                        sounds.append(animal.falar()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sounds.toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}