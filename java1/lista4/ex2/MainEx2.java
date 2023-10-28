package java1.lista4.ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainEx2 {
    public static void main(String[] args) {
        Pessoa pessoa = null;
        Automovel automovel = null;

        ArrayList<Pessoa> lstPessoas = new ArrayList<>();

        int opt;
        int codigo;
        int indexPessoa;
        int indexCarro;
        
        String nome;
        String marca;
        String modelo;
        String str;

        Automovel tmpAutomovel = null;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu\n"+
                "\n[1] Criar pessoa"+
                "\n[2] Criar automovel"+
                "\n[3] Transferir automovel"+
                "\n[4] Mostrar todas as pessoas"+
                "\n[5] Mostrar automovel da pessoa"+
                "\n[6] Sair"));
            
            switch(opt) {
                case 1: // criar pessoa
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa:"));
                    nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    pessoa  = new Pessoa(codigo, nome);
                    lstPessoas.add(pessoa);
                    break;

                case 2: // criar automovel
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do dono do automovel:"));

                    for (Pessoa tmpPessoa : lstPessoas) {
                        if(tmpPessoa.getCodigo() != codigo);
                        else {
                            marca = JOptionPane.showInputDialog("Digite a marca:");
                            modelo = JOptionPane.showInputDialog("Digite o modelo:");
                            automovel = new Automovel(marca, modelo);
                            tmpPessoa.inserirAutomovel(automovel);
                        }
                    }
                    break;

                case 3: // transferir automovel
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do dono original:"));

                    for(Pessoa tmpPessoa  : lstPessoas) {
                        if (tmpPessoa.getCodigo() != codigo);
                        else {
                            indexCarro = Integer.parseInt(JOptionPane.showInputDialog(
                                tmpPessoa.imprimirCompleto()+
                                "\n\nDigite o numero do automovel a ser transferido:")) - 1;
                            tmpAutomovel = tmpPessoa.getAutomovel(indexCarro);
                            tmpPessoa.removerAutomovel(indexCarro);

                            indexPessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do novo dono:"));

                            for(Pessoa tmpPessoa2  : lstPessoas) {
                                if (indexPessoa == tmpPessoa2.getCodigo())
                                    tmpPessoa2.inserirAutomovel(tmpAutomovel);
                            }
                        }
                    }
                    break;

                case 4: // mostrar pessoas
                str = "";

                for(Pessoa tmpPessoa : lstPessoas)
                        str += tmpPessoa.imprimir() + "\n";
                    JOptionPane.showMessageDialog(null, str);
                    break;

                case 5: // mostrar automoveis da pessoa
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa:"));

                    for (Pessoa tmpPessoa : lstPessoas) {
                        if(tmpPessoa.getCodigo() != codigo);
                        else
                            JOptionPane.showMessageDialog(null, tmpPessoa.imprimirCompleto());
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
