package com.alanviana.model.domain;

import com.alanviana.model.enums.Metodo;
import com.alanviana.model.enums.StatusInseminacao;
import com.alanviana.model.domain.posparto.CronogramaPosParto;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Inseminacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private UUID id;
    @ManyToOne
    private Animal progenitora;
    private LocalDate data;
    @ManyToOne
    private Animal progenitor;
    private Metodo metodo;
    private StatusInseminacao statusInseminacao;
    private LocalDate dt_parto;

    @OneToMany(mappedBy = "inseminacao", cascade = CascadeType.ALL)
    private List<CronogramaDG> cronogramaDG = new ArrayList<>();

    @OneToMany(mappedBy = "inseminacao", cascade = CascadeType.ALL)
    private List<DiagnosticoGestacional> dg = new ArrayList<>();

    @OneToMany(mappedBy = "inseminacao", cascade = CascadeType.ALL)
    private List<CronogramaPosParto> cpp = new ArrayList<>();

    public Inseminacao() {
    }

    public Inseminacao(Animal progenitora, LocalDate data, Animal progenitor, Metodo metodo) {
        this.progenitora = progenitora;
        this.data = data;
        this.progenitor = progenitor;
        this.metodo = metodo;
        this.id = UUID.randomUUID();
    }

    public void addCronogramaDG(CronogramaDG cronogramaDG){
        this.cronogramaDG.add(cronogramaDG);
    }

    public void addDiagnosticoGestacional(DiagnosticoGestacional diagnosticoGestacional){
        this.dg.add(diagnosticoGestacional);
    }

    public LocalDate getDt_parto() {
        return dt_parto;
    }

    public void setDt_parto(LocalDate dt_parto) {
        this.dt_parto = dt_parto;
    }

    public List<CronogramaPosParto> getCpp() {
        return cpp;
    }

    public void setCpp(ArrayList<CronogramaPosParto> cpp) {
        this.cpp = cpp;
    }

    public StatusInseminacao getStatusInseminacao() {
        return statusInseminacao;
    }

    public void setStatusInseminacao(StatusInseminacao statusInseminacao) {
        this.statusInseminacao = statusInseminacao;
    }

    public List<CronogramaDG> getCronogramaDG() {
        return cronogramaDG;
    }

    public void setCronogramaDG(List<CronogramaDG> cronogramaDG) {
        this.cronogramaDG = cronogramaDG;
    }

    public UUID getId() {
        return id;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
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

    public Animal getProgenitor() {
        return progenitor;
    }

    public void setProgenitor(Animal progenitor) {
        this.progenitor = progenitor;
    }

    public List<DiagnosticoGestacional> getDg() {
        return dg;
    }

    public void setDg(ArrayList<DiagnosticoGestacional> dg) {
        this.dg = dg;
    }
}
