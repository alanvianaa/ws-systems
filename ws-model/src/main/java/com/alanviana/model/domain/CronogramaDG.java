package com.alanviana.model.domain;

import com.alanviana.model.enums.StatusCronograma;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class CronogramaDG implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private UUID id;
    @ManyToOne
    private Inseminacao inseminacao;
    private LocalDate data;
    private Short dias;
    private String acao;
    private StatusCronograma statusCronograma;

    public CronogramaDG() {
    }

    public CronogramaDG(Inseminacao inseminacao, LocalDate data, String acao, StatusCronograma statusCronograma) {
        this.inseminacao = inseminacao;
        this.data = data;
        this.acao = acao;
        this.statusCronograma = statusCronograma;
    }

    public CronogramaDG(Inseminacao inseminacao, Short dias, String acao, StatusCronograma statusCronograma) {
        this.inseminacao = inseminacao;
        this.data = inseminacao.getData().plusDays(dias);
        this.dias = dias;
        this.acao = acao;
        this.statusCronograma = statusCronograma;
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
