package com.alanviana.model.repositories;

import com.alanviana.model.domain.Inseminacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InseminacaoRepository extends JpaRepository<Inseminacao, Integer> {

}
