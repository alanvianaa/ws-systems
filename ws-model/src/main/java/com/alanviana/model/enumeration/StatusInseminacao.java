package com.alanviana.model.enumeration;

public enum StatusInseminacao {

    NAOGEROU(1, "Não Funcionou "),
    GESTANTE(2, "Animal Gestantes"),
    NASCIDOVIVO(3, "Nascido Vivo"),
    NASCIDOMORTO(4, "Nascido Morto"),
    ABORTOESPONTANEO(5, "Aborto espontaneo"),
    ABORTO(6, "Aborto"),
    MORTOPOSPARTO(6, "Morto Pós-Parto");

    public final static StatusInseminacao[] listagem = {NAOGEROU,GESTANTE,NASCIDOVIVO,NASCIDOMORTO,ABORTOESPONTANEO,ABORTO,MORTOPOSPARTO};

    private final Integer id;
    private final String descricao;

    StatusInseminacao(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusInseminacao[] getStatusInseminacao() {
        return listagem;
    }

}
