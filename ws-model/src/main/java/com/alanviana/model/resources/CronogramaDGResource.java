package com.alanviana.model.resources;

import com.alanviana.model.domain.Animal;
import com.alanviana.model.domain.CronogramaDG;
import com.alanviana.model.service.CronogramaDGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cronograma_dg")
public class CronogramaDGResource  {

    @Autowired
    private CronogramaDGService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CronogramaDG>> findAll() {
        List<CronogramaDG> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
