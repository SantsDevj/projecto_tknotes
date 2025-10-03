package implementacao_classes;
public enum PrioridadeTarefa {
    ALTA("Alta"), MEDIA("Média"), BAIXA("Baixa");

    private String descricao;
    PrioridadeTarefa(String desc){
        this.descricao = desc;
    }

    public String getDescricao() {
        return descricao;
    }

    public static PrioridadeTarefa paraString(String texto){
        for (PrioridadeTarefa pri_tar : PrioridadeTarefa.values()) {
            if (pri_tar.descricao.equalsIgnoreCase(texto)) {
                return pri_tar;
                
            }
        }

        throw new IllegalArgumentException("Nenhuma prioridade com a decrição " + texto + " encontrada.");
    }
}
