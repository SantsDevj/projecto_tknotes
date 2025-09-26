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
}
