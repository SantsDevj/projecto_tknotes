package implementacao_classes;
import java.util.Date;


public class Tarefa {

    //Atributos da Classe
    private int id;
    private String titulo;
    private String descricao;
    private Date data_Vencimento;
    private String categoria;
    private PrioridadeTarefa prioridade;
    private boolean concluida;

    //Getters e Setters Específicos uns Atributos

    //Descrição
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Data de Vencimento
    public Date getData_Vencimento() {
        return data_Vencimento;
    }
    public void setData_Vencimento(Date data_Vencimento) {
        this.data_Vencimento = data_Vencimento;
    }

    //categoria
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Prioridade
    public PrioridadeTarefa getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(PrioridadeTarefa prioridade) {
        this.prioridade = prioridade;
    }
    
    //Métodos da Classe
    public boolean isConcluida() {
        return false;
    }

    public void setConcluida(boolean status) {
        this.concluida = status;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}