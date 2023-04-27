package tech.devinhouse.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.devinhouse.server.service.NomeService;

import java.util.List;

@RestController
@RequestMapping("api")
public class NomesController {

    @Autowired
    private NomeService service;

    @GetMapping
    public ResponseEntity<List<String>> consultarNomes() {
        List<String> nomes = service.obterNomes();
        return ResponseEntity.ok(nomes);
    }

}