import java.util.Date;

public class Tarefa {

    //Atributos da Classe
    private int id;
    private String titulo;
    private Date data_Vencimento;
    private String categoria;
    private PrioridadeTarefa prioridade;

    //Getters e Setters
    private boolean concluida;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Date getData_Vencimento() {
        return data_Vencimento;
    }
    public void setData_Vencimento(Date data_Vencimento) {
        this.data_Vencimento = data_Vencimento;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public PrioridadeTarefa getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(PrioridadeTarefa prioridade) {
        this.prioridade = prioridade;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
