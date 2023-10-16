package java1.lista4.ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Estou usando o vscode entao nao fiz todos os metodos sets e gets para as classes, apenas os necessarios, espero que nao se importe.
 */

public class MainEx1 {
    public static void main(String[] args) {
        Curso curso = null;
        Aluno alu = null;

        ArrayList<Curso> lstCursos = new ArrayList<>();


        // Eu pensei em reciclar a mesma variavel varias vezes mas zelei pela organização. (No mesmo switch e/ou usar opt inves de criar outras int)
        int opt;
        int codigo;
        int cargaHoraria;
        
        String ra;
        String nome;
        String str;

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
                        if(tmpCurso.getCodigo() != codigo);
                        else {
                            ra = JOptionPane.showInputDialog("Digite o RA:");
                            nome = JOptionPane.showInputDialog("Digite o nome:");
                            alu = new Aluno(ra, nome);
                            tmpCurso.inserirAluno(alu);
                        }
                    }
                    break;

                case 3: // remover aluno
                    ra = JOptionPane.showInputDialog("Digite o RA do aluno:");

                    for(Curso tmpCursos : lstCursos) {
                        if (tmpCursos.getAluno(ra) == -1);
                        else
                            tmpCursos.removerAluno(tmpCursos.getAluno(ra));
                    }
                    break;

                case 4: // mostrar cursos
                str = "";

                for(Curso tmpCursos : lstCursos)
                        str += tmpCursos.imprimir();
                    JOptionPane.showMessageDialog(null, str+"\n");
                    break;

                case 5: // mostrar alunos do curso
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso:"));

                    for (Curso tmpCurso : lstCursos) {
                        if(tmpCurso.getCodigo() != codigo);
                        else
                            JOptionPane.showMessageDialog(null, tmpCurso.imprimirCompleto());
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
        
}
