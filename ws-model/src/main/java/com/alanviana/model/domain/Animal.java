package com.alanviana.model.domain;

import com.alanviana.model.enums.Categoria;
import com.alanviana.model.enums.Sexo;
import com.alanviana.model.enums.StatusAnimal;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private UUID id;
    private Integer numero;
    private String nome;
    private LocalDate dtNascimento;
    private Sexo sexo;
    private Categoria categoria;
    private StatusAnimal statusAnimal;
    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<Inseminacao> list_inseminacoes = new ArrayList<>();

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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
