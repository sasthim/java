package java1.JOptionPane.ex1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Aluno alu = null;
        ArrayList<Aluno> lstAlunos = new ArrayList<>();

        int opt;
        String ra;
        String nome;

        do {
            // Mudar: 3- busca 4- remover 5- sair
            opt = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n[1] Criar aluno\n[2] Mostrar alunos\n[3] Sair"));
            
            switch(opt) {
                case 1:
                    ra = JOptionPane.showInputDialog("Digite o RA:");
                    nome = JOptionPane.showInputDialog("Digite o nome:");

                    alu = new Aluno(ra, nome);
                    lstAlunos.add(alu);
                    break;
                case 2:
                    String str = "";
                    
                    /*for(Aluno aluTmp : lstAlunos) {
                        int i = 1;z
                        str+= ....
                    } */

                    for(int i = 0; i < lstAlunos.size(); i++)
                        str+= "Aluno "+(i+1)+lstAlunos.get(i).imprimir()+"\n\n";
                    JOptionPane.showMessageDialog(null, str, "Lista de alunos", 2);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}