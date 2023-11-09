package projetoDB.views;

import projetoDB.dao.UsuarioDAO;
import projetoDB.entity.Usuario;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuDao = new UsuarioDAO();

        int op, id;
        String str, login, senha;

        // CRUD (Create, Read, Updade e Delete)
        while(true){
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"+
                                        "\n[1] Inserir usuário"+
                                        "\n[2] Editar usuário"+
                                        "\n[3] Apagar usuário"+
                                        "\n[4] Listar todos"+
                                        "\n[5] Sair"));

            switch (op) {
                case 1: // Create
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do usuario:"));
                    login = JOptionPane.showInputDialog("Login:");
                    senha = JOptionPane.showInputDialog("Senha:");
                    
                    Usuario usu = new Usuario(id, login, senha);
                    usuDao.inserir(usu);
                    break;

                case 2: // Update
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do usuario:"));
                    usuDao.editar();
                    break;

                case 3: // Remove
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do usuario:"));
                    usuDao.excluir();
                    break;

                case 4:
                    ArrayList<Usuario> lstUsuarios = usuDao.getAllUsuarios();
                    str = "";

                    for (Usuario tmpUsuario : lstUsuarios) {
                        str += tmpUsuario.toString();
                    }
                    JOptionPane.showMessageDialog(null, str);
                    break;
                case 5:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        }    
    }
}