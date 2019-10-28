package com.alanviana.model;

import com.alanviana.model.enums.*;
import com.alanviana.model.domain.Animal;
import com.alanviana.model.domain.CronogramaDG;
import com.alanviana.model.domain.Inseminacao;
import com.alanviana.model.repositories.AnimalRepository;
import com.alanviana.model.repositories.CronogramaDGRepository;
import com.alanviana.model.repositories.InseminacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    InseminacaoRepository inseminacaoRepository;
    @Autowired
    CronogramaDGRepository cronogramaDGRepository;

    public void initialize(){
        ArrayList<Animal> listaAnimais = new ArrayList<Animal>();

        Animal animal1 = new Animal(115, "Magrela", LocalDate.of(2012, 06, 15), Sexo.FEMEA, Categoria.VACA);

        animal1.setStatusAnimal(StatusAnimal.GESTANTE);

        Animal animal2 = new Animal(110, "Cornão", LocalDate.of(2010, 10, 25), Sexo.MACHO, Categoria.TOURO);

        Inseminacao inseminacao = new Inseminacao(animal1, LocalDate.of(2019, 01, 01), animal2, Metodo.IA);
        Short dias = 30;
        CronogramaDG cronogramaDG1 = new CronogramaDG(inseminacao ,dias, "Fazer Primeira ultrasson", StatusCronograma.PENDENTE);
        inseminacao.addCronogramaDG(cronogramaDG1);
        dias = 90;
        CronogramaDG cronogramaDG2 = new CronogramaDG(inseminacao ,dias, "Fazer Primeira ultrasson", StatusCronograma.PENDENTE);
        inseminacao.addCronogramaDG(cronogramaDG2);
        dias = 220;
        CronogramaDG cronogramaDG3 = new CronogramaDG(inseminacao ,dias, "Fazer Primeira ultrasson", StatusCronograma.PENDENTE);
        inseminacao.addCronogramaDG(cronogramaDG3);


        listaAnimais.add(animal1);
        listaAnimais.add(animal2);

        animalRepository.saveAll(Arrays.asList(animal1, animal2));
        inseminacaoRepository.saveAll(Arrays.asList(inseminacao));
        cronogramaDGRepository.saveAll(Arrays.asList(cronogramaDG1,cronogramaDG2,cronogramaDG3));

        animal1.addInseminacao(inseminacao);
        System.out.println("Vaca - Status: " + animal1.getStatusAnimal() + "\n" +
                "   id: " + animal1.getId() + "\n" +
                "   Nome: " + animal1.getNome() + "\n" +
                "   Progenitor: " + animal1.getList_inseminacoes().get(0).getProgenitor().getNome() + "\n" +
                "   Metodo: " + animal1.getList_inseminacoes().get(0).getMetodo().getDescricao() + "\n" +
                "   Parto Previsto: Entre " + animal1.getList_inseminacoes().get(0).getData().plusDays(280) + " e " + animal1.getList_inseminacoes().get(0).getData().plusDays(290));
        System.out.println("");
    }
}
