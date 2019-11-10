package com.alanviana.model.domain.posparto;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Ultrasson implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    UUID id;
    LocalDate dtExame;
    Long condicaoUltero;
    Long condicaoOvarios;

    public Ultrasson(LocalDate dtExame, Long condicaoUltero, Long condicaoOvarios) {
        this.dtExame = dtExame;
        this.condicaoUltero = condicaoUltero;
        this.condicaoOvarios = condicaoOvarios;
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
