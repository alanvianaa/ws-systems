package com.alanviana.model.repositories;

import com.alanviana.model.domain.CronogramaDG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CronogramaDGRepository  extends JpaRepository<CronogramaDG, Integer> {

}
