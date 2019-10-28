package com.alanviana.model.model;

import com.alanviana.model.enumeration.StatusCronograma;

import java.time.LocalDate;
import java.util.UUID;

public class CronogramaDG {

    private UUID id;
    private LocalDate data;
    private Short dias;
    private String acao;
    private StatusCronograma statusCronograma;

    public CronogramaDG(LocalDate data, String acao, StatusCronograma statusCronograma) {
        this.data = data;
        this.acao = acao;
        this.statusCronograma = statusCronograma;
        this.id = UUID.randomUUID();
    }

    public CronogramaDG(Short dias, String acao, StatusCronograma statusCronograma) {
        this.dias = dias;
        this.acao = acao;
        this.statusCronograma = statusCronograma;
        this.id = UUID.randomUUID();
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Short getDias() {
        return dias;
    }

    public void setDias(Short dias) {
        this.dias = dias;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
