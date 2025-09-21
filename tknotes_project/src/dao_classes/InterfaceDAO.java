package dao_classes;

public interface InterfaceDAO {
    public abstract void cadastroUserDAO(String nome, String email, String senha);
    public abstract void criarTarefaDAO();
    public abstract void editarTarefaDAO();
    public abstract void excluirTarefaDAO();
    public abstract void marcarComoCuncluidaDAO();
    public abstract void visTodasTarefas();
    public abstract void filtrarTarefas();

}
