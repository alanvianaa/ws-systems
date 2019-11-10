package com.alanviana.model.domain.posparto;

import com.alanviana.model.domain.Inseminacao;
import com.alanviana.model.enums.StatusCronograma;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class CronogramaPosParto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "inseminacao_id")
    private Inseminacao inseminacao;
    private LocalDate data;
    private Short dias;
    private String acao;
    private StatusCronograma statusCronograma;

    public CronogramaPosParto(LocalDate data, Short dias, String acao, StatusCronograma statusCronograma) {
        this.data = data;
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

    public StatusCronograma getStatusCronograma() {
        return statusCronograma;
    }

    public void setStatusCronograma(StatusCronograma statusCronograma) {
        this.statusCronograma = statusCronograma;
    }
}
