package com.pacotes.aluguel;


import com.pacotes.aluguel.model.Usuario;
import com.pacotes.aluguel.service.LoginService;
import com.pacotes.aluguel.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


@Controller
@RequestMapping("/")
public class LoginController implements WebMvcConfigurer {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value={"/", "/login"})
    public String loginForm() {

        return "login";
    }

    @PostMapping("/login")
    public String validateLogin(
            @RequestParam(value = "nome", required = true) String nome,
            @RequestParam(value = "senha", required = true) String senha,
            Model model) {
        Long id = 0l;

        id = loginService.valida(nome, senha);

        if( id == 0){
            model.addAttribute("error", "usuario ou senha inválido");
            return "login";
        }

        model.addAttribute("id", id);
        model.addAttribute("nome", nome);
        //model.addAttribute("nome", )

        //return "index";
        return "index";
    }
}