package com.pacotes.aluguel.controller;


import com.pacotes.aluguel.model.Usuario;
import com.pacotes.aluguel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listAll(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}