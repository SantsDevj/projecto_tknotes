package implementacao_classes;

public class ListaTarefas {
    private int id_lista;
    private String nome;

    
    public ListaTarefas(int id_lista, String nome) {
        this.id_lista = id_lista;
        this.nome = nome;
    }

    
    public int getId_lista() {
        return id_lista;
    }
    public void setId_lista(int id_lista) {
        this.id_lista = id_lista;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
