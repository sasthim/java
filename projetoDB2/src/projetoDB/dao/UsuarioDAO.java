package projetoDB.dao;

import projetoDB.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {

    public void inserir(Usuario usuario) {
        String sql = "insert into usuario(login,senha) values (?,?)";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usuário: " + ex.getMessage());
        }
    }

    public void editar(Usuario usuario) {
        String sql = "update usuario set login = ?, senha = ? where id_usuario = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getId_usuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao editar usu�rio: " + ex.getMessage());
        }
    }

    public void excluir(int codigo) {
        String sql = "delete from usuario where id_usuario = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir usu�rio: " + ex.getMessage());
        }
    }

    public ArrayList<Usuario> getAllUsuarios() {
        String sql = "SELECT * FROM usuario";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                int id_usuario = rs.getInt("id_usuario");

                Usuario usuario = new Usuario(id_usuario, login, senha);
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos usu�rio: " + ex.getMessage());
        }

        return usuarios;
    }

    public Usuario selecionarPorCodigo(int id_usuario) {
        Usuario usuario = null;
        String sql = "select * from Usuario where id_usuario = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_usuario); // Definir o valor do par�metro

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Obter os dados do ResultSet e criar um objeto Usuario
                    usuario = new Usuario(rs.getInt("id_usuario"), rs.getString("Login"), rs.getString("Senha"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao selecionar por c�digo usu�rio: " + ex.getMessage());
        }

        return usuario;
    }
    
    public boolean autenticar(String login, String senha) {
        Usuario usuario = null;
        String sql = "select * from Usuario where login = ? and senha = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);){
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao autenticar usu�rio: " + ex.getMessage());
        }
        
        return false;
    }
}
