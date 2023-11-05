package java1.tarefa.classeAbstrata;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<>();
        int op, numeroCracha, pag, qtdeHoras;
        String nome, setor, funcao;
        double valorHora, salario, desconto;

        while(true) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n[1] Criar funcionario\n[2] Mostrar\n[3] Sair"));

            switch (op) {
                case 1:
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Numero cracha:"));
                    nome = JOptionPane.showInputDialog("Nome do funcionario:");
                    setor = JOptionPane.showInputDialog("Setor:");
                    funcao = JOptionPane.showInputDialog("Funcao: ");

                    pag = Integer.parseInt(JOptionPane.showInputDialog("[1] Horista\n[2] Mensalista"));

                    if(pag == 1){
                        qtdeHoras = Integer.parseInt(JOptionPane.showInputDialog("Quantiade de horas:"));
                        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Valor por hora:"));
                        
                        FuncionarioHorista f = new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdeHoras, valorHora);
                        lstFuncionarios.add(f);
                    }

                    else if(pag == 2){
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
                        desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto:"));
                        
                        FuncionarioMensalista f = new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario, desconto);
                        lstFuncionarios.add(f);
                    }

                    break;

                case 2:
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Numero cracha:"));

                    for (Funcionario tmpFuncionario : lstFuncionarios)
                        if(numeroCracha == tmpFuncionario.getNumeroCracha())
                            JOptionPane.showMessageDialog(null, tmpFuncionario.toString());
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
