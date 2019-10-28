package com.alanviana.model.model;

import com.alanviana.model.enumeration.Metodo;
import com.alanviana.model.enumeration.StatusInseminacao;
import com.alanviana.model.model.posparto.CronogramaPosParto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Inseminacao {

    private UUID id;
    private LocalDate data;
    private Animal progenitor;
    private Metodo metodo;
    private StatusInseminacao statusInseminacao;
    private LocalDate dt_parto;
    private ArrayList<CronogramaDG> cronogramaDG = new ArrayList<CronogramaDG>();
    private ArrayList<DiagnosticoGestacional> dg = new ArrayList<DiagnosticoGestacional>();
    private ArrayList<CronogramaPosParto> cpp = new ArrayList<CronogramaPosParto>();



    public Inseminacao(LocalDate data, Animal progenitor, Metodo metodo) {
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

    public ArrayList<CronogramaPosParto> getCpp() {
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

    public ArrayList<CronogramaDG> getCronogramaDG() {
        return cronogramaDG;
    }

    public void setCronogramaDG(ArrayList<CronogramaDG> cronogramaDG) {
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

    public ArrayList<DiagnosticoGestacional> getDg() {
        return dg;
    }

    public void setDg(ArrayList<DiagnosticoGestacional> dg) {
        this.dg = dg;
    }
}
