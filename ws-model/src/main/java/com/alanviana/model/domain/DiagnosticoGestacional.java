package com.alanviana.model.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class DiagnosticoGestacional implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "inseminacao_id")
    private Inseminacao inseminacao;
    private LocalDate dt_Avaliacao;
    private Long anotacoes;


    public DiagnosticoGestacional(LocalDate dt_Avaliacao, Long anotacoes) {
        this.dt_Avaliacao = dt_Avaliacao;
        this.anotacoes = anotacoes;
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
