package com.spring.security.controllers;

import com.spring.security.models.PessoaModel;
import com.spring.security.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @GetMapping
    public List<PessoaModel> findAll(){
        return pessoaService.findAll();
    }
    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoa){
        return pessoaService.criarPessoa(pessoa);
    }
}
