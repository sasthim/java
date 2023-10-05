package java1.JOptionPane;

import javax.swing.JOptionPane;

public class teste1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String[] itens = { "Masculino", "Feminino" };
        Object sexo = JOptionPane.showInputDialog(null,
                "Selecione seu sexo: ",
                "Opçao",
                JOptionPane.QUESTION_MESSAGE,
                null, itens, itens[0]);

        JOptionPane.showMessageDialog(null,
        "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo,
        "Perfil", 1,
        null);
        
        JOptionPane.showConfirmDialog(null, "Tem certeza que deseja confirmar?", "Confirmaçao", JOptionPane.YES_NO_OPTION);

    }
}
