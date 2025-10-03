package implementacao_classes;
import java.util.Date;
import java.util.List;

public class GerenciadorTarefas {

    //Métodos desta classe ou Service Layer
    public void criarTarefa(String titulo, String descricao, Date data_Vencimento, String categoria, String prioridade){
        
    }
    public void editarTarefa(String novo_titulo, String novo_descricao, Date novo_data_Vencimento, String novo_categoria, String novo_prioridade){

    }

    public void excluirTarefa(int id){

    }
    public void marcarComoConcluido(int id){

    }
    public List<Tarefa> visualizarTarefas(){
        return null;
    }

    public List<Tarefa> filtaTarefas(String criterio, String valor){
        return null;
    }
}
