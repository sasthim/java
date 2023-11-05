package java1.tarefa.ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {
    public static String listaDisciplinas(ArrayList<Disciplina> lstDisciplinas){
        String str = "";

        for(int i = 0; i < lstDisciplinas.size(); i++)
            str += "Diciplina: " + lstDisciplinas.get(i).getNome() + "\tCodigo: " + lstDisciplinas.get(i).getCodigo() + "\n";
        
        return str;
    }

    public static void main(String[] args){
        Disciplina disciplina = null;
        Professor professor = null;
        Atendente atendente = null;
        Aluno aluno = null;
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        ArrayList<Disciplina> lstDisciplinas = new ArrayList<>();

        int op;
        int codigo;
        int numeroCracha;

        double salario;

        String str;
        String cpf;
        String nome;
        String setor;
        String funcao;
        String ra;
        String urlLattes;
        String[] options = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        while(true){
            op = JOptionPane.showOptionDialog(null,
                "Menu\n"+
                "\n[1] Inserir disciplina"+
                "\n[2] Inserir professor"+
                "\n[3] Inserir atendente"+
                "\n[4] Inserir aluno"+
                "\n[5] Adicionar disciplina ao professor"+
                "\n[6] Mostrar pessoas"+
                "\n[7] Mostrar disciplinas"+
                "\n[8] Aplicar bonificacoes"+
                "\n[9] Sair", 
                null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 0) + 1;

            switch(op){
                case 1:     //INSERIR DISCIPLINA
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da nova disciplina."));
                    nome = JOptionPane.showInputDialog("Digite o nome da nova disciplina.");

                    disciplina = new Disciplina(codigo, nome);

                    lstDisciplinas.add(disciplina);
                    break;

                case 2:     //INSERIR PROFESSOR
                    nome = JOptionPane.showInputDialog("Nome:");
                    cpf = JOptionPane.showInputDialog("CPF:");
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Numero do Cracha:"));
                    salario = Integer.parseInt(JOptionPane.showInputDialog("Salario:"));
                    urlLattes = JOptionPane.showInputDialog("Lattes:");
 
                    professor = new Professor(nome, cpf, numeroCracha, salario, urlLattes);

                    lstPessoas.add(professor);
                    break;

                case 3:     //INSERIR ATENDENTE
                    nome = JOptionPane.showInputDialog("Nome:");
                    cpf = JOptionPane.showInputDialog("CPF:");
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Numero do Cracha:"));
                    salario = Integer.parseInt(JOptionPane.showInputDialog("Salario:"));
                    setor = JOptionPane.showInputDialog("Setor:");
                    funcao = JOptionPane.showInputDialog("Funcao:");
 
                    atendente = new Atendente(nome, cpf, numeroCracha, salario, setor, funcao);

                    lstPessoas.add(atendente);
                    break;

                case 4:     //INSERIR ALUNO
                    nome = JOptionPane.showInputDialog("Nome:");
                    cpf = JOptionPane.showInputDialog("CPF:");
                    ra = JOptionPane.showInputDialog("RA:");
                    // Dava pra fazer mais facil, pegando o index, mas vou seguir o pedido
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina do aluno: \n" + listaDisciplinas(lstDisciplinas)));

                    for(int i = 0; i < lstDisciplinas.size(); i++)
                        if(lstDisciplinas.get(i).getCodigo() == codigo)
                            disciplina = lstDisciplinas.get(i);

                    aluno = new Aluno(nome, cpf, ra, disciplina);

                    lstPessoas.add(aluno);
                    break;
                
                case 5:     //ADICONAR DISCIPLINA AO PROFESSOR
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina do aluno: \n" + listaDisciplinas(lstDisciplinas)));

                    for(int i = 0; i < lstDisciplinas.size(); i++)
                        if(lstDisciplinas.get(i).getCodigo() == codigo)
                            disciplina = lstDisciplinas.get(i);

                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o cracha do professor: \n"));

                    for (Pessoa p : lstPessoas) {
                        if (p instanceof Professor){
                            if(((Professor)p).getCracha() == codigo)
                                professor = (Professor)p;
                        }
                    }
                    break;

                case 6:     //MOSTRAR PESSOAS
                    str = "       Nome\tCPF\n";
                    for(int i = 0; i < lstPessoas.size(); i++) {
                        str += "\n[" + (i+1) + "]   " + lstPessoas.get(i).getNome() + "\t" + lstPessoas.get(i).getCpf();
                    }
                    JOptionPane.showMessageDialog(null, new JTextArea(str));
                    break;

                case 7:     //MOSTRAR DISCIPLINAS
                    str = "       Nome\tCodigo\n";
                    for(int i = 0; i < lstDisciplinas.size(); i++) {
                        str += "\n[" + (i+1) + "]   " + lstDisciplinas.get(i).getNome() + "\t" + lstDisciplinas.get(i).getCodigo();
                    }
                    JOptionPane.showMessageDialog(null, new JTextArea(str));
                    break;

                case 8:     //APLICAR BONIFICACOES cracha > funcionario:+10% | atendente:+15% | professor:+100%
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o cracha do funcionario: \n"));

                    for (Pessoa p : lstPessoas) {
                            if(((Funcionario)p).getCracha() == codigo) {
                                if(p instanceof Atendente)
                                    ((Atendente)p).bonificacao();

                                else if(p instanceof Professor)
                                    ((Professor)p).bonificacao();
                                    
                                else
                                    ((Funcionario)p).bonificacao();
                            }
                    }
                    break;

                case 9:     //SAIR
                    System.exit(0);
                    break;
            }
        }
    }
}
