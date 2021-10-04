package com.pacotes.aluguel.service;

import com.pacotes.aluguel.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private final UsuarioService usuarioService;

    public LoginService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public long valida(String nome, String senha){
        long id = 0;
        try{
            List<Usuario> usuarios = usuarioService.getByNome(nome);
            for(Usuario user: usuarios) {
                if (user.getSenha().equalsIgnoreCase(senha)) {
                    return user.getId();
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return id;
    }
}
