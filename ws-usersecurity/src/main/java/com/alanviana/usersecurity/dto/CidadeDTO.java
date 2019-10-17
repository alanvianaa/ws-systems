package com.alanviana.usersecurity.dto;

import java.io.Serializable;
import java.util.UUID;

import com.alanviana.usersecurity.domain.Cidade;

public class CidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private UUID uuid;
	private String nome;
	
	public CidadeDTO() {
	}

	public CidadeDTO(Cidade obj) {
		uuid = obj.getId();
		nome = obj.getNome();
	}
	
	public UUID getId() {
		return uuid;
	}

	public void setId(UUID id) {
		this.uuid = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
