package com.pacotes.aluguel.service;

import com.pacotes.aluguel.model.Usuario;
import com.pacotes.aluguel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository userInfoRepository) {
        this.usuarioRepository = userInfoRepository;
    }

    public List<Usuario> getUsers() {
        return usuarioRepository.findAll();
    }

    public Usuario createUser(Usuario userInfo) {
        return usuarioRepository.save(userInfo);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
