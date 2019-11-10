package com.alanviana.model.domain.posparto;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Citologia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    UUID id;
    LocalDate tdColeta;
    Short qtdColeta;
    Short qtdAmostra;

    public Citologia(LocalDate td_coleta, Short qtd_coleta, Short qtd_amostra) {
        this.tdColeta = td_coleta;
        this.qtdColeta = qtd_coleta;
        this.qtdAmostra = qtd_amostra;
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
