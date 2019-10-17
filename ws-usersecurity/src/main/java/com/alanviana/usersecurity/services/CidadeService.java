package com.alanviana.usersecurity.services;

import java.util.List;
import java.util.UUID;

import com.alanviana.usersecurity.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanviana.usersecurity.domain.Cidade;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;

	public List<Cidade> findByEstado(UUID estadoId) {
		return repo.findCidades(estadoId);
	}
}
