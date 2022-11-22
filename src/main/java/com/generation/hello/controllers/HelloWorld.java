package com.generation.hello.controllers;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class HelloWorld {
    @GetMapping("/hello")
    public String helloWorld(){

        return "Hello World";

    }

    @GetMapping ("/bsm")
    public ArrayList<String> bsm(){

        ArrayList<String> listaBsm = new ArrayList<>();
        listaBsm.add("BSM");

        listaBsm.add("Introdução às Habilidades Comportamentais e Mentalidades");
        listaBsm.add("Mentalidade de Crescimento");
        listaBsm.add("Persistência");
        listaBsm.add("Responsabilidade Pessoal");
        listaBsm.add("Orientação ao Futuro");
        listaBsm.add("Comunicação");
        listaBsm.add("Orientação ao Detalhe");
        listaBsm.add("Proatividade");

        return listaBsm;
    }
     @GetMapping("/metas")
      public ArrayList<String> metas(){

        ArrayList<String> listaMetas = new ArrayList<>();

        listaMetas.add("Orientação aos Detalhes");
        listaMetas.add("Comunicação");
        listaMetas.add("Trabalho em Equipe");

        return listaMetas;


      }

}
