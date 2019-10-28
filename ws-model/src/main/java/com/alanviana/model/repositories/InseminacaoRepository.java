package com.alanviana.model.repositories;

import com.alanviana.model.domain.Inseminacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public interface InseminacaoRepository extends JpaRepository<Inseminacao, Integer> {

    @Transactional(readOnly = true)
    @Query("SELECT obj FROM Inseminacao obj WHERE obj.id = :id")
    Inseminacao findById(@Param("id") UUID id);

}
