package java1.lista4.ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainEx1 {
    public static void main(String[] args) {
        Curso curso = null;
        Aluno alu = null;

        ArrayList<Curso> lstCursos = new ArrayList<>();

        int opt;
        int codigo;
        int cargaHoraria;
        String ra;
        String nome;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu\n"+
                "\n[1] Criar curso"+
                "\n[2] Criar aluno"+
                "\n[3] Remover aluno"+
                "\n[4] Mostrar todos os cursos"+
                "\n[5] Mostrar alunos do curso"+
                "\n[6] Sair"));
            
            switch(opt) {
                case 1: // criar curso
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso:"));
                    nome = JOptionPane.showInputDialog("Digite o nome do curso:");
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaria do curso:"));
                    curso  = new Curso(codigo, nome, cargaHoraria);
                    lstCursos.add(curso);
                    break;
                case 2: // criar aluno
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso:"));

                    for (Curso tmpCurso : lstCursos) {
                        if(tmpCurso.getCodigo() == codigo) {
                            ra = JOptionPane.showInputDialog("Digite o RA:");
                            nome = JOptionPane.showInputDialog("Digite o nome:");

                            alu = new Aluno(ra, nome);
                            tmpCurso.inserirAluno(alu);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Curso nao encontrado.");
                        }
                    }
                    break;
                case 3: // remover aluno
                    ra = JOptionPane.showInputDialog("Digite o RA do aluno:");

                    for(Curso tmpCursos : lstCursos) {
                        if (tmpCursos.getAluno(ra) != -1)
                            tmpCursos.removerAluno(tmpCursos.getAluno(ra));
                    }

                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
        
}
