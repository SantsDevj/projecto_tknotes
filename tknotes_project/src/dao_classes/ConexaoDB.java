package dao_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    protected Connection connect;
    
    //Criando a conexão com a Base de Dados através do Constructor
    public ConexaoDB(){
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tknotes", "root", "");
            System.out.println("Conexão feita com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com a base de Dados");
        }
    }
}
