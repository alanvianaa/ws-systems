package com.alanviana.model.repositories;

import com.alanviana.model.domain.DiagnosticoGestacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticoGestacionalRepository extends JpaRepository<DiagnosticoGestacional, Integer> {
}
