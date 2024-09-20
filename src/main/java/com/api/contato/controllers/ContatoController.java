package com.api.contato.controllers;

import com.api.contato.dto.ContatoDTO;
import com.api.contato.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatoController {
    @Autowired
    ContatoService contatoService;
    @PostMapping("/contato/add")
    public Object cadastroCurso(@RequestBody ContatoDTO data){
        return ResponseEntity.ok(contatoService.salvaContato(data));
    }


    @GetMapping("/contatos")
    public List Contato(){
        return contatoService.listAll();
    }
}
