package com.alanviana.model.model.posparto;

import com.alanviana.model.enums.StatusCronograma;

import java.time.LocalDate;
import java.util.UUID;

public class CronogramaPosParto {

    UUID id;
    LocalDate data;
    Short dias;
    String acao;
    StatusCronograma statusCronograma;

    public CronogramaPosParto(LocalDate data, Short dias, String acao, StatusCronograma statusCronograma) {
        this.data = data;
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

    public StatusCronograma getStatusCronograma() {
        return statusCronograma;
    }

    public void setStatusCronograma(StatusCronograma statusCronograma) {
        this.statusCronograma = statusCronograma;
    }
}
