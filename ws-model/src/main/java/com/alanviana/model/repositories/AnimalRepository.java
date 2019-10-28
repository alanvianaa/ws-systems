package com.alanviana.model.repositories;

import com.alanviana.model.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Transactional(readOnly = true)
    @Query("SELECT obj FROM Animal obj WHERE obj.id = :id")
    Animal findById(@Param("id") UUID id);

}