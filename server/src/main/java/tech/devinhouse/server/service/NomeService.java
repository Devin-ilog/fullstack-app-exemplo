package tech.devinhouse.server.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NomeService {

    private List<String> nomes = Arrays.asList("tiago", "silvana", "vinicius", "luciano");


    public List<String> obterNomes() {
        return nomes;
    }

}
