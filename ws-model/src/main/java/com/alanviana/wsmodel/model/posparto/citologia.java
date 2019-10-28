package com.alanviana.wsmodel.model.posparto;

import java.time.LocalDate;
import java.util.UUID;

public class citologia {

    UUID id;
    LocalDate tdColeta;
    Short qtdColeta;
    Short qtdAmostra;

    public citologia(LocalDate td_coleta, Short qtd_coleta, Short qtd_amostra) {
        this.tdColeta = td_coleta;
        this.qtdColeta = qtd_coleta;
        this.qtdAmostra = qtd_amostra;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getTdColeta() {
        return tdColeta;
    }

    public void setTdColeta(LocalDate tdColeta) {
        this.tdColeta = tdColeta;
    }

    public Short getQtdColeta() {
        return qtdColeta;
    }

    public void setQtdColeta(Short qtdColeta) {
        this.qtdColeta = qtdColeta;
    }

    public Short getQtdAmostra() {
        return qtdAmostra;
    }

    public void setQtdAmostra(Short qtdAmostra) {
        this.qtdAmostra = qtdAmostra;
    }
}
