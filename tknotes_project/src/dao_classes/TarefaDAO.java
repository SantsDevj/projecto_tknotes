package dao_classes;

import java.sql.*;

public class TarefaDAO  implements InterfaceDAO{
    private Connection connect;
    
    //Criando a conexão com a Base de Dados através do Constructor
    public TarefaDAO(){
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tknotes", "root", "");
            System.out.println("Conexão feita com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com a base de Dados");
        }
    }
    
    //Métodos da Classe de Manipulação de Dados
    @Override
    public void cadastroUserDAO(String nome, String email, String senha) {

    }
    @Override
    public void criarTarefaDAO() {
        
    }

    @Override
    public void editarTarefaDAO() {
        
    }

    @Override
    public void excluirTarefaDAO() {
        
    }

    @Override
    public void marcarComoCuncluidaDAO() {

    }

    @Override
    public void visTodasTarefas() {
        
    }

    @Override
    public void filtrarTarefas() {
        
    }
    
    
}
