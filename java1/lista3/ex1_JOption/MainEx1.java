package java1.lista3.ex1_JOption;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainEx1 {
    public static void main(String[] args) {
        Apolice apolice = null;
        ArrayList<Apolice> lstApolice = new ArrayList<>();

        // Integer[] options = {1, 2, 3};
        String[] menuOptions = { "[1] Criar apolice", "[2] Ver dados apolice", "[3] Buscar", "[4] Apagar", "[5] Sair" };
        String[] sexoOptions = { "Masculino", "Feminino" };

        int opcao = 0;

        int tmpNumero;
        String tmpNome;
        int tmpIdade;
        int tmpSexo; // 0 = M, 1 = F
        double tmpValorAutomovel;

        while (true) {
            /*
             * System.out.println("Digite a opcao desejada:");
             * System.out.println("[1] Criar apolice");
             * System.out.println("[2] Ver dados apolice");
             * System.out.println("[3] Sair");
             */

            opcao = JOptionPane.showOptionDialog(null, "Digite a opcao desejada:",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, null);

            switch (opcao) {
                case 0:
                    apolice = new Apolice();
                    tmpNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
                    tmpNome = JOptionPane.showInputDialog("Digite o nome:");
                    tmpIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                    tmpSexo = JOptionPane.showOptionDialog(null, "Selecione o sexo:",
                            null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sexoOptions, null);
                    tmpValorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do automovel:"));

                    apolice = new Apolice(tmpNumero, tmpNome, tmpIdade, tmpSexo, tmpValorAutomovel);
                    lstApolice.add(apolice);
                    break;

                case 1:
                    String str = "";
                    for (int i = 0; i < lstApolice.size(); i++)
                        str += "Apolice " + (i + 1) + lstApolice.get(i).imprimir() + "\n\n";
                    JOptionPane.showMessageDialog(null, str, "Lista de apolices", JOptionPane.PLAIN_MESSAGE);
                    break;

                case 2:
                    tmpNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da apolice:"));
                    for (int i = 0; i < lstApolice.size(); i++)
                        if (tmpNumero == lstApolice.get(i).getNumero())
                            JOptionPane.showMessageDialog(null, lstApolice.get(i).imprimir(), "Apolice encontrada", JOptionPane.PLAIN_MESSAGE);
                    break;

                case 3:
                    tmpNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da apolice:"));
                    for (int i = 0; i < lstApolice.size(); i++)
                        if (tmpNumero == lstApolice.get(i).getNumero())
                            lstApolice.remove(i); // Possivel implementacao: Confirmacao do JOption mostrando a apolice a ser deletada.
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}