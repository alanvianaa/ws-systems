package com.alanviana.model.repositories;

import com.alanviana.model.domain.posparto.Ultrasson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UltrassonRepository extends JpaRepository<Ultrasson, Integer> {
}
