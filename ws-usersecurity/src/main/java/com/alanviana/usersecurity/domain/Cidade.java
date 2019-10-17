package com.alanviana.usersecurity.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 16, unique = true, nullable = false)
	private UUID id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="estado_id")
	private Estado estado;
	
	public Cidade() {
	}

	public Cidade(UUID id, String nome, Estado estado) {
		super();
		if(id == null){
			this.id = UUID.randomUUID();
		}
		this.nome = nome;
		this.estado = estado;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
