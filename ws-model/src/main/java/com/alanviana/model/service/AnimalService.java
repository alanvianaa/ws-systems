package com.alanviana.model.service;

import com.alanviana.model.domain.Animal;
import com.alanviana.model.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class AnimalService {

    @Autowired
    AnimalRepository repo;

    public List<Animal> findAll() {
        return repo.findAll();
    }

    public Animal find(UUID id) {
        return repo.findById(id);
    }

}
