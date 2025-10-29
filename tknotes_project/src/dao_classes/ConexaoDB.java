package dao_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexaoDB {

    //Atributos  para a conexão
    private static final String URL = "jdbc:mysql://localhost:3306/tknotes";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection criarConexao() throws SQLException{
        try {
            Connection connect = DriverManager.getConnection(URL, USER, PASS);
            return connect;
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com a base de Dados" + e.getMessage());
            throw e;
        }

    }
    

}
