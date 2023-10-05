package java1.lista3.ex2_JOption;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainEx2 {
    public static void main(String[] args) {
        Vendedor vendedor = null;
        ArrayList<Vendedor> lstVendedor = new ArrayList<>();

        String[] menuOptions = {"[1] Cadastrar vendedor", "[2] Calcular venda", "[3] Apagar vendedor", "[4] Sair"};

        int tmpCodigo;
        String tmpNome;
        double tmpPercentualComissao;

        double tmpValor;
        String tmpDesconto;
        
        while (true) {

            switch (JOptionPane.showOptionDialog(null, "Digite a opcao desejada:",
            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, null)) {
                case 0:
                    tmpCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));
                    tmpNome = JOptionPane.showInputDialog("Digite o nome:");
                    tmpPercentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de comissao:"));

                    vendedor = new Vendedor(tmpCodigo, tmpNome, tmpPercentualComissao);
                    lstVendedor.add(vendedor);
                    break;

                case 1:
                    tmpCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do vendedor:"));
                    tmpValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda:"));
                    tmpDesconto = JOptionPane.showInputDialog("Digite o valor do desconto:");

                    for (int i = 0; i < lstVendedor.size(); i++)
                        if (tmpCodigo == lstVendedor.get(i).getCodigo()) {
                            if(tmpDesconto != "")
                                JOptionPane.showMessageDialog(null, lstVendedor.get(i).imprimir(tmpValor, Double.parseDouble(tmpDesconto)), 
                                    "Lista de apolices", JOptionPane.PLAIN_MESSAGE);       
                            else
                                lstVendedor.get(i).imprimir(tmpValor);
                        }
                    break;

                case 2:
                    tmpCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da vendedor:"));
                    for (int i = 0; i < lstVendedor.size(); i++)
                        if (tmpCodigo == lstVendedor.get(i).getCodigo())
                            lstVendedor.remove(i); // Possivel implementacao: Confirmacao do JOption mostrando o vendedor a ser deletada.
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
