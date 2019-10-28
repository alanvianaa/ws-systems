package com.alanviana.model.enumeration;

public enum Categoria {

    NOVILHA(1,"Vaquinha"),
    VACA(2, "Vaca Parideira"),
    TOURO(3, "Boi Taradao"),
    BEZERRO(4,"Bovino até 3 anos");

    public final static Categoria [] listagem = {VACA, TOURO, BEZERRO, NOVILHA};

    private final Integer id;
    private final String descricao;

    private Categoria(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Categoria[] getListagem() {
        return listagem;
    }

}
