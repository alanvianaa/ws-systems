package com.alanviana.model.service;

import com.alanviana.model.domain.CronogramaDG;
import com.alanviana.model.repositories.CronogramaDGRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CronogramaDGService {

    @Autowired
    CronogramaDGRepository repo;

    public List<CronogramaDG> findAll() {
        return repo.findAll();
    }

    public CronogramaDG find(UUID id) {
        return repo.findById(id);
    }

}
