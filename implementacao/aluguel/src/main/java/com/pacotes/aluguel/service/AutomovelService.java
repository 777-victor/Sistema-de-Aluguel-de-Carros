package com.pacotes.aluguel.service;

import com.pacotes.aluguel.model.Automovel;
import com.pacotes.aluguel.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovelService{
    @Autowired
    private AutomovelRepository automovelRepository;

    public List<Automovel> getAutomoveis(){ return automovelRepository.findAll(); }


}
