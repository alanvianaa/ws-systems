package com.alanviana.model.enumeration;

public enum StatusCronograma {

    PENDENTE(1, "Pendente"),
    CONCLUIDO(2,"Concluido"),
    NAOCOMCLUIDO(3, "Não Concluido"),
    CANCELADO(3, "Cancelado");


    public final static StatusCronograma[] listagem = {PENDENTE, CONCLUIDO, NAOCOMCLUIDO, CANCELADO};

    private final Integer id;
    private final String descricao;

    StatusCronograma(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusCronograma[] getStatusDG() {
        return listagem;
    }

}
