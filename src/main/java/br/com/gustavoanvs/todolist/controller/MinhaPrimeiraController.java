package br.com.gustavoanvs.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota") //annotation que será responsavel em criar a rota 
public class MinhaPrimeiraController {

    /**
     * O que esta acontencendo aqui?
     * 
     * Toda vez que a rota bater na "primeiraRota" que foi definida com a Annotation "@RequestMapping", ela entrará
     * na nossa Controller de requisição, que foi definida antes da classe pela Annotation "@RestController" e será
     * identificado em nossos métodos da classe o que será feito, perceba que o meétodo da classe recebe também uma
     * annotation a cima da classe, referenciando qual será o Método do REST que utilizaremos, no nosso exemplo o get,
     * usando assim a Annotation "@GetMapping". :)
     */

    /**
     * MÉTODOS DO HTTP PARA FAZER REQUISIÇÕES:
     * GET - bucar uma info/dado
     * POST - add uma info/dado
     * PUT - alterar info/dado
     * DELETE - remover info/dado
     * PATCH - alterar apenas uma parte da info/dado
     */

     //Métdo (funcionalidade) da nossa classe6

     @GetMapping({"/", ""})
        public String primeiraMensagem(){
            return "Funfou";
        }
}