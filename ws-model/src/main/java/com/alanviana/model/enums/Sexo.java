package com.alanviana.model.enums;

public enum Sexo {
    FEMEA(1, "Femea"),
    MACHO(2,"Macho");

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
