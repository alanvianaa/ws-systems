package com.alanviana.model.enumeration;

public enum StatusAnimal {
    INSEMINADO(1, "Animal foi inseminado"),
    GESTANTE(2, "Animal está buchuda"),
    PARIU(3, "Animal já Pariu"),

    COLETADO(4,"Feito a coleta do esperma");


    public final static StatusAnimal[] listagemFemea = {INSEMINADO, GESTANTE, PARIU};
    public final static StatusAnimal[] listagemMacho = {COLETADO};

    private final Integer id;
    private final String descricao;

    StatusAnimal(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusAnimal[] getListagemFemea() {
        return listagemFemea;
    }

    public static StatusAnimal[] getListagemMacho() {
        return listagemMacho;
    }
}
