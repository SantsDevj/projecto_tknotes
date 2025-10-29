package dao_classes;

import java.sql.*;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

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

    //Método para login do usuário

    public static boolean loginUsuario(String email, String passwrd){
        boolean temConta = false; //Inicialização da variável que validará os dados
        //comando sql para executar esta instrucção

        String sqlCommand = "SELECT email, senha FROM usuario WHERE email = ? AND senha = ?";

        try (Connection connect = ConexaoDB.criarConexao();
            PreparedStatement state = connect.prepareStatement(sqlCommand)
        ) {
            state.setString(1, email);
            state.setString(2, passwrd);

            try(ResultSet result = state.executeQuery()){
                if (result.next()) {
                    temConta = true;
                    System.out.println("Dados presentes na base de dados!");
                } else{
                    temConta = false;
                    System.out.println("Dados não encontrados!");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao executar a consulta " + e.getMessage()); 
        }
        return temConta;
    }
}
