package dao_classes;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

import implementacao_classes.*;

public class UsuarioDAO {

    //Método para adicionar os dados
    public static void adicionarUsuario(Usuario usuario){
        //Comando SQL para inserir os dados
        String sql = "INSERT INTO usuario (nome_usuario, senha, email) VALUES (?, ?, ?)";

        try(Connection connect = ConexaoDB.criarConexao();
            PreparedStatement state = connect.prepareStatement(sql)){

            //Criando statements para inserir dados no banco de dados
            state.setString(1, usuario.getNome_usuario());
            state.setString(2, usuario.getSenha());
            state.setString(3, usuario.getEmail());

            //Verificando se as linhas foram afectadas
            int linhasAfectadas = state.executeUpdate();
            
            if (linhasAfectadas > 0) {
                System.out.println("O usuário " + usuario.getNome_usuario() + " inserido com sucesso!");
            } else{
                System.out.println("Nenhum usuário inserido ");
            }

        }catch(SQLException e){
            System.err.print("Erro ao inserir os dados" + e.getMessage());
        }
    }

    //Método para logar o usuário

    public static String loginUsuario(String nome, String email){

        //Instânciando a classe usuário
        Usuario userConsulta = new Usuario();

        //comando sql para a consulta e comparação
        String sql = "SELECT nome_usuario, email FROM usuario WHERE nome_usuario = " + userConsulta.getNome_usuario();
        try (Connection conexao = ConexaoDB.criarConexao();
            PreparedStatement statement = conexao.prepareStatement(sql);
        ) {
            ResultSet res = statement.executeQuery(sql);
            String nomeVal = ""; 
            String emailVal = "";
            while (res.next()) {
                nomeVal = res.getString("nome");
                emailVal = res.getString("email");
            }

            nome = nomeVal;
            email = emailVal;

        } catch (SQLException e) {
            System.out.println("Erro ao obter elemento " + e.getMessage());
        }
        return nome + email;

    } 
}
