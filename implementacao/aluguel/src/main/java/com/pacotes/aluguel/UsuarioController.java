package com.pacotes.aluguel;


import com.pacotes.aluguel.model.Usuario;
import com.pacotes.aluguel.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService userService;

    public UsuarioController(UsuarioService userService) {
        this.userService = userService;
    }

//    @PostMapping
//    public String save(Usuario usuario){
//        System.out.println(usuario);
//        Usuario user = userService.createUser(usuario);
//        return "redirect:/usuario/";
//    }


    @GetMapping
    public String usuario(Model model) {
        List<Usuario> usuarios = userService.getUsers();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("usuario", new Usuario());
        return "usuarioForm";
    }

    @RequestMapping(value = "/delete/{id}")
    private String deleteStudent(@PathVariable(name = "id") String id){
        System.out.println("Student_Id : "+id);
        userService.delete(Long.parseLong(id));
        return "redirect:/usuario";
    }

//    @GetMapping
//    public String teste(Model model) {
//        List<Usuario> usuarios = userService.getUsers();
//        model.addAttribute("usuarios", usuarios);
//        model.addAttribute("usuario", new Usuario());
//        return "teste";
//    }


//    @DeleteMapping
//    public String deleteUser(Model model, Usuario usuario) {
//        userService.delete(usuario);
//        return "redirect:/usuario/";
//    }





}