package com.alanviana.model.enumeration;

public enum Metodo {

    IA(1,"Inseminação Artificial"),
    IATF(2, "Inseminação Artificial em Tempo Fixo"),
    MONTA(3, "Método Natural");

    public final static Metodo [] listagem = {IA, IATF, MONTA};

    private final Integer id;
    private final String descricao;

    private Metodo(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Metodo[] getMetodo() {
        return listagem;
    }

}
