package com.alanviana.wsmodel.model;

import com.alanviana.wsmodel.enumeration.Categoria;
import com.alanviana.wsmodel.enumeration.Sexo;
import com.alanviana.wsmodel.enumeration.StatusAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Animal {

    private UUID id;
    private Integer numero;
    private String nome;
    private LocalDate dtNascimento;
    private Sexo sexo;
    private Categoria categoria;
    private StatusAnimal statusAnimal;
    private ArrayList<Inseminacao> list_inseminacoes = new ArrayList<Inseminacao>();

    public Animal() {
    }

    public Animal(Integer numero, String nome, LocalDate dtNascimento, Sexo sexo, Categoria categoria) {
        this.id = UUID.randomUUID();
        this.numero = numero;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.categoria = categoria;
    }

    public List<Inseminacao> getList_inseminacoes() {
        return list_inseminacoes;
    }

    public void setList_inseminacoes(ArrayList<Inseminacao> list_inseminacoes) {
        this.list_inseminacoes = list_inseminacoes;
    }
    public void addInseminacao(Inseminacao inseminacao){
        this.list_inseminacoes.add(inseminacao);
    }

    public StatusAnimal getStatusAnimal() {
        return statusAnimal;
    }

    public void setStatusAnimal(StatusAnimal statusAnimal) {
        this.statusAnimal = statusAnimal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dt_nascimento) {
        this.dtNascimento = dtNascimento;
    }

}
