package implementacao_classes;
import dao_classes.TarefaDAO;

public class ClassePrinicpal {
        public static void main(String[] args) {
        TarefaDAO tarefaDAO = new TarefaDAO();
        tarefaDAO.cadastroUserDAO("Santos", "Santos@gmail.com", "SantosTarefas");
    }
}
