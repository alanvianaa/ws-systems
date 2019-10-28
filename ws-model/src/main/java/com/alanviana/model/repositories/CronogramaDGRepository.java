package com.alanviana.model.repositories;

import com.alanviana.model.domain.CronogramaDG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.UUID;

@Repository
public interface CronogramaDGRepository  extends JpaRepository<CronogramaDG, Integer> {

    @Transactional(readOnly = true)
    @Query("SELECT obj FROM CronogramaDG obj WHERE obj.id = :id")
    CronogramaDG findById(@Param("id") UUID id);
}
