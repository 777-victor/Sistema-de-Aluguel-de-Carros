package com.pacotes.aluguel;

import com.pacotes.aluguel.controller.UsuarioController;
import com.pacotes.aluguel.model.Usuario;
import com.pacotes.aluguel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


@Controller
public class WebController implements WebMvcConfigurer {
    @Autowired
    UsuarioRepository usuarioRepository;

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/results").setViewName("results");
//    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/usuarioForm")
    public String usuarioForm(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("usuario", new Usuario());
        return "usuarioForm";
    }

//    @PostMapping("/registroSucesso")
//    public String submitForm(@ModelAttribute Usuario usuario, Model model) {
//        System.out.println(usuario);
//        //model.addAttribute("greeting", greeting);
//        return "usuarioRegistroSucesso";
//    }

//    @PostMapping("/")
//    public String checkPersonInfo(Usuario usuario) {
//
//        return "teste";
//    }
}