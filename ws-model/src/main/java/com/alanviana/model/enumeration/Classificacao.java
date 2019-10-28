package com.alanviana.model.enumeration;

public enum Classificacao{

    NULIPARA(1, "Nenhuma Gestação"),
    PRIMIPARA(2,"Primeira gestação"),
    MULTIPARA(3, "Multipla Gestação");


    public final static Classificacao [] listagem = {NULIPARA, PRIMIPARA,MULTIPARA};

    private final Integer id;
    private final String descricao;

    private Classificacao(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Classificacao[] getClassificacao() {
        return listagem;
    }

}
