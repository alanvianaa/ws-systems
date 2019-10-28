package com.alanviana.model.model;

import java.time.LocalDate;
import java.util.UUID;

public class DiagnosticoGestacional {

    private UUID id;
    private LocalDate dt_Avaliacao;
    private Long anotacoes;


    public DiagnosticoGestacional(LocalDate dt_Avaliacao, Long anotacoes) {
        this.dt_Avaliacao = dt_Avaliacao;
        this.anotacoes = anotacoes;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDt_Avaliacao() {
        return dt_Avaliacao;
    }

    public void setDt_Avaliacao(LocalDate dt_Avaliacao) {
        this.dt_Avaliacao = dt_Avaliacao;
    }

    public Long getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(Long anotacoes) {
        this.anotacoes = anotacoes;
    }
}
