package com.alanviana.model.repositories;

import com.alanviana.model.domain.posparto.Citologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitologiaRepository extends JpaRepository<Citologia, Integer> {
}
