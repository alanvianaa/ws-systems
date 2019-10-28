package com.alanviana.model.enumeration;

public enum Sexo {
    MACHO(1,"Inseminação Artificial"),
    FEMEA(2, "Inseminação Artificial em Tempo Fixo");

    public final static Sexo [] listagem = {MACHO, FEMEA};

    private final Integer id;
    private final String descricao;

    Sexo(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Sexo[] getSexo() {
        return listagem;
    }
}
