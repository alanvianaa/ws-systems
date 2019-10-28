package com.alanviana.wsmodel.model.posparto;

import java.time.LocalDate;
import java.util.UUID;

public class ultrasson {

    UUID id;
    LocalDate dtExame;
    Long condicaoUltero;
    Long condicaoOvarios;

    public ultrasson(LocalDate dtExame, Long condicaoUltero, Long condicaoOvarios) {
        this.dtExame = dtExame;
        this.condicaoUltero = condicaoUltero;
        this.condicaoOvarios = condicaoOvarios;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDtExame() {
        return dtExame;
    }

    public void setDtExame(LocalDate dtExame) {
        this.dtExame = dtExame;
    }

    public Long getCondicaoUltero() {
        return condicaoUltero;
    }

    public void setCondicaoUltero(Long condicaoUltero) {
        this.condicaoUltero = condicaoUltero;
    }

    public Long getCondicaoOvarios() {
        return condicaoOvarios;
    }

    public void setCondicaoOvarios(Long condicaoOvarios) {
        this.condicaoOvarios = condicaoOvarios;
    }
}
