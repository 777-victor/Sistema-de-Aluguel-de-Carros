package com.pacotes.aluguel;


import com.pacotes.aluguel.model.Automovel;
import com.pacotes.aluguel.model.Pedido;
import com.pacotes.aluguel.model.Usuario;
import com.pacotes.aluguel.service.AutomovelService;
import com.pacotes.aluguel.service.PedidoService;
import com.pacotes.aluguel.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/automovel/{id}")
public class AutomovelController {

    private final AutomovelService automovelService;
    private final PedidoService pedidoService;

    public AutomovelController(AutomovelService automovelService, PedidoService pedidoService) {
        this.automovelService = automovelService;
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public String automoveis(@PathVariable(name = "id") String id, Model model) {
        List<Automovel> automoveis = automovelService.getAutomoveis();
        model.addAttribute("automoveis", automoveis);
        model.addAttribute("userId", id);
        model.addAttribute("pedido", new Pedido());

        return "automovelList";
    }


}