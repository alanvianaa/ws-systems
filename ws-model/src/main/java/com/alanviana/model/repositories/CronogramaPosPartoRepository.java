package com.alanviana.model.repositories;

import com.alanviana.model.domain.posparto.CronogramaPosParto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CronogramaPosPartoRepository extends JpaRepository<CronogramaPosParto, Integer> {
}
