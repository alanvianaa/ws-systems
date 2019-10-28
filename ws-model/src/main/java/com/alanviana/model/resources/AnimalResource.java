package com.alanviana.model.resources;

import com.alanviana.model.domain.Animal;
import com.alanviana.model.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/animais")
public class AnimalResource {

    @Autowired
    private AnimalService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Animal> find(@PathVariable UUID id) {
        Animal obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Animal>> findAll() {
        List<Animal> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }


}
